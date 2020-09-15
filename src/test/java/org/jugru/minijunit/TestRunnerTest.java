package org.jugru.minijunit;

import org.jugru.minijunit.annotation.Test;
import org.jugru.minijunit.dto.TestClassResult;
import org.jugru.minijunit.dto.TestResult;
import org.jugru.minijunit.logging.TestInfoPrinter;
import org.jugru.minijunit.logging.impl.TestInfoPrinterImpl;
import org.jugru.minijunit.help.ClassWithGoodTests;
import org.jugru.minijunit.validation.TestClassValidation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import static java.util.Arrays.asList;
import static org.jugru.minijunit.assertion.Assert.*;

public class TestRunnerTest {
    private final TestClassValidation classValidation = new TestClassValidation();
    private final TestInfoPrinter infoPrinter = new TestInfoPrinterImpl();
    private final TestRunner testRunner = new TestRunner(classValidation, infoPrinter);

    @Test
    public void runClassTests() {
        final Class<ClassWithGoodTests> goodTestsClass = ClassWithGoodTests.class;

        final TestClassResult actualTestClassResult = testRunner.runTests(goodTestsClass);
        assertEquals("org.jugru.minijunit.help.ClassWithGoodTests", actualTestClassResult.getClassName());
        assertEquals(2, actualTestClassResult.getSuccessTestNumber());
        assertEquals(1, actualTestClassResult.getFailedTestNumber());
        assertTrue(actualTestClassResult.getFailedTestExceptions().get(0) instanceof InvocationTargetException);
    }

    @Test
    public void getTestMethods() throws NoSuchMethodException {
        final Class<ClassWithGoodTests> goodTestsClass = ClassWithGoodTests.class;
        final List<Method> testMethods = asList(
                goodTestsClass.getDeclaredMethod("goodTest"),
                goodTestsClass.getDeclaredMethod("goodTest_failed"),
                goodTestsClass.getDeclaredMethod("goodTest_second")
        );

        assertEquals(testMethods, testRunner.getTestMethods(goodTestsClass));
    }

    @Test
    public void runMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Class<ClassWithGoodTests> goodTestsClass = ClassWithGoodTests.class;
        final Method goodTest = goodTestsClass.getDeclaredMethod("goodTest");
        final TestResult expectedTestResult = TestResult.builder().success(true).build();

        assertEquals(expectedTestResult, testRunner.run(goodTest, goodTestsClass.getConstructor().newInstance()));
    }

    @Test
    public void runMethod_failed() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final Class<ClassWithGoodTests> goodTestsClass = ClassWithGoodTests.class;
        final Method goodTest_failed = goodTestsClass.getDeclaredMethod("goodTest_failed");

        final TestResult actualTestResult = testRunner.run(goodTest_failed, goodTestsClass.getConstructor().newInstance());
        assertFalse(actualTestResult.isSuccess());
        assertTrue(actualTestResult.getException() instanceof InvocationTargetException);
    }
}
