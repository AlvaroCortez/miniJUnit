package org.jugru.minijunit.validation;

import org.jugru.minijunit.annotation.Test;
import org.jugru.minijunit.help.ClassWithWrongTests;

import java.lang.reflect.Method;
import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.jugru.minijunit.assertion.Assert.*;

public class TestClassValidationTest {
    private final TestClassValidation validation = new TestClassValidation();

    @Test
    public void validateClasses() {
        final List<Exception> expectedExceptions = asList(
                new Exception("Method org.jugru.minijunit.help.ClassWithWrongTests.badTest_hasArgument should have no argument"),
                new Exception("Method org.jugru.minijunit.help.ClassWithWrongTests.badTest_private should be public"),
                new Exception("Method org.jugru.minijunit.help.ClassWithWrongTests.badTest_returnString should be void"),
                new Exception("Method org.jugru.minijunit.help.ClassWithWrongTests.badTest_static should not be static")
        );
        final List<Exception> exceptions = validation.validateClasses(singletonList(ClassWithWrongTests.class));
        assertNotNull(exceptions.get(0));
        assertNotNull(exceptions.get(1));
        assertNotNull(exceptions.get(2));
        assertNotNull(exceptions.get(3));
        assertEquals(expectedExceptions.get(0).getMessage(), exceptions.get(0).getMessage());
        assertEquals(expectedExceptions.get(1).getMessage(), exceptions.get(1).getMessage());
        assertEquals(expectedExceptions.get(2).getMessage(), exceptions.get(2).getMessage());
        assertEquals(expectedExceptions.get(3).getMessage(), exceptions.get(3).getMessage());
    }

    @Test
    public void validatePublicMethod_exception() throws NoSuchMethodException {
        final Class<ClassWithWrongTests> testsClass = ClassWithWrongTests.class;
        final Method badTest_private = testsClass.getDeclaredMethod("badTest_private");
        final Exception actual = validation.validatePublic(badTest_private, testsClass);
        final String expectedMessage = format("Method %s.%s should be public", testsClass.getName(), badTest_private.getName());
        assertTrue(actual.getMessage().contains(expectedMessage));
    }

    @Test
    public void validatePublicMethod() throws NoSuchMethodException {
        final Class<ClassWithWrongTests> testsClass = ClassWithWrongTests.class;
        final Method badTest_private = testsClass.getDeclaredMethod("goodTest");
        final Exception actual = validation.validatePublic(badTest_private, testsClass);
        assertNull(actual);
    }

    @Test
    public void validatePublic_exception() {
        final Class<PrivateClass> privateClass = PrivateClass.class;
        final Exception actual = validation.validatePublic(privateClass);
        final String expectedMessage = format("Class %s should be public", privateClass.getName());
        assertTrue(actual.getMessage().contains(expectedMessage));
    }

    @Test
    public void validatePublic() {
        final Class<ClassWithWrongTests> testsClass = ClassWithWrongTests.class;
        final Exception actual = validation.validatePublic(testsClass);
        assertNull(actual);
    }

    private class PrivateClass {}
}
