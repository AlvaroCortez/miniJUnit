package org.jugru.minijunit.logging.impl;

import org.jugru.minijunit.dto.TestClassResult;
import org.jugru.minijunit.logging.TestInfoPrinter;

import java.io.PrintStream;
import java.util.List;


public class TestInfoPrinterImpl implements TestInfoPrinter {
    private final PrintStream writer;

    public TestInfoPrinterImpl() {
        writer = System.out;
    }

    @Override
    public void printErrors(List<Exception> exceptions) {
        exceptions.forEach(writer::println);
    }

    @Override
    public void printTestClassResult(List<TestClassResult> testClassResults) {
        testClassResults.forEach(testClassResult -> {
            writer.println(testClassResult.getClassName() + ":");
            writer.println(testClassResult.getSuccessTestNumber() + " tests completed");
            writer.println(testClassResult.getFailedTestNumber() + " failed");
            testClassResult.getFailedTestExceptions().forEach(writer::println);
        });
    }

    @Override
    public void printNoSuchClass(List<String> classes) {
        classes.forEach(clazz -> writer.println("No such class " + clazz));
    }
}
