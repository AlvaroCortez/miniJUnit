package org.jugru.minijunit;

import lombok.AllArgsConstructor;
import org.jugru.minijunit.annotation.Test;
import org.jugru.minijunit.dto.TestClassResult;
import org.jugru.minijunit.dto.TestResult;
import org.jugru.minijunit.logging.TestInfoPrinter;
import org.jugru.minijunit.validation.TestClassValidation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

@AllArgsConstructor
public class TestRunner {
    private final TestClassValidation classValidation;
    private final TestInfoPrinter testInfoPrinter;

    public void runTest(List<Class<?>> classes) {
        final List<Exception> classErrors = classValidation.validateClasses(classes);
        if (!classErrors.isEmpty()) {
            testInfoPrinter.printErrors(classErrors);
            return;
        }

        final List<TestClassResult> testClassResults = classes.stream()
                .map(this::runTests)
                .collect(toList());
        testInfoPrinter.printTestClassResult(testClassResults);
    }

    TestClassResult runTests(Class<?> clazz) {
        final List<Method> testMethods = getTestMethods(clazz);
        final List<TestResult> testResults = testMethods.stream().map(method -> {
            try {
                return run(method, clazz.getConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                return TestResult.builder().success(false).exception(e).build();
            }
        }).collect(toList());

        final List<Exception> failedTestException = testResults.stream().map(TestResult::getException).filter(Objects::nonNull).collect(toList());
        final long successTestNumber = testResults.stream().filter(TestResult::isSuccess).count();
        return TestClassResult.builder()
                .className(clazz.getName())
                .successTestNumber(successTestNumber)
                .failedTestNumber(failedTestException.size())
                .failedTestExceptions(failedTestException)
                .build();
    }

    List<Method> getTestMethods(Class<?> clazz) {
        final Method[] methods = clazz.getDeclaredMethods();
        return Arrays.stream(methods).filter(method -> method.isAnnotationPresent(Test.class)).collect(toList());
    }

    TestResult run(Method method, Object object) {
        try {
            method.invoke(object);
            return TestResult.builder().success(true).build();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return TestResult.builder().success(false).exception(e).build();
        }
    }
}
