package org.jugru.minijunit.validation;

import org.jugru.minijunit.annotation.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.lang.String.format;
import static java.lang.reflect.Modifier.isPublic;
import static java.lang.reflect.Modifier.isStatic;
import static java.util.stream.Collectors.toList;

public class TestClassValidation {

    public List<Exception> validateClasses(List<Class<?>> classes) {
        final List<Exception> classErrors = classes.stream()
                .flatMap(this::validateClass)
                .collect(toList());
        final List<Exception> methodErrors = classes.stream()
                .flatMap(this::validateMethods)
                .collect(toList());
        return Stream.of(classErrors, methodErrors)
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .collect(toList());
    }

    private Stream<Exception> validateClass(Class<?> clazz) {
        return Stream.of(
                validatePublic(clazz),
                validateNonStaticInnerClass(clazz),
                validateOnlyOneConstructorNoArguments(clazz));
    }

    private Stream<Exception> validateMethods(Class<?> clazz) {
        final Method[] methods = clazz.getDeclaredMethods();
        final List<Method> testMethods = Arrays.stream(methods).filter(method -> method.isAnnotationPresent(Test.class)).collect(toList());
        if (testMethods.isEmpty()) {
            return Stream.of(new Exception(format("No test methods in class %s", clazz.getName())));
        }

        return testMethods.stream().flatMap(method -> validateMethod(method, clazz));
    }

    private Stream<Exception> validateMethod(Method method, Class<?> clazz) {
        return Stream.of(
                validatePublic(method, clazz),
                validateVoid(method, clazz),
                validateNoArguments(method, clazz),
                validateNoStatic(method, clazz));
    }

    Exception validatePublic(Method method, Class<?> clazz) {
        if (!isPublic(method.getModifiers())) {
            return new Exception(format("Method %s.%s should be public", clazz.getName(), method.getName()));
        }
        return null;
    }

    Exception validateVoid(Method method, Class<?> clazz) {
        if (method.getReturnType() != Void.TYPE) {
            return new Exception(format("Method %s.%s should be void", clazz.getName(), method.getName()));
        }
        return null;
    }

    Exception validateNoArguments(Method method, Class<?> clazz) {
        if (method.getParameterCount() != 0) {
            return new Exception(format("Method %s.%s should have no argument", clazz.getName(), method.getName()));
        }
        return null;
    }

    Exception validateNoStatic(Method method, Class<?> clazz) {
        if (isStatic(method.getModifiers())) {
            return new Exception(format("Method %s.%s should not be static", clazz.getName(), method.getName()));
        }
        return null;
    }

    Exception validatePublic(Class<?> clazz) {
        if (!isPublic(clazz.getModifiers())) {
            return new Exception(format("Class %s should be public", clazz.getName()));
        }
        return null;
    }

    Exception validateNonStaticInnerClass(Class<?> clazz) {
        if (clazz.isMemberClass() && !isStatic(clazz.getModifiers())) {
            return new Exception(format("Inner class %s should be static", clazz.getName()));
        }
        return null;
    }

    Exception validateOnlyOneConstructorNoArguments(Class<?> clazz) {
        final Constructor<?>[] constructors = clazz.getConstructors();
        if (constructors.length != 1) {
            return new Exception(format("Class %s should have only one constructor", clazz.getName()));
        }

        final Constructor<?> mainConstructor = constructors[0];
        if (mainConstructor.getParameterCount() != 0) {
            return new Exception(format("Class %s should have only one constructor without arguments", clazz.getName()));
        }

        return null;
    }
}
