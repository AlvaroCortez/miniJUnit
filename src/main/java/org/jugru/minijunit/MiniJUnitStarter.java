package org.jugru.minijunit;

import org.jugru.minijunit.dto.CommandLineArgsParserResult;
import org.jugru.minijunit.logging.TestInfoPrinter;
import org.jugru.minijunit.logging.impl.TestInfoPrinterImpl;
import org.jugru.minijunit.validation.TestClassValidation;

public class MiniJUnitStarter {
    public static void main(String[] args) {
        final CommandLineArgsParser commandLineArgsParser = new CommandLineArgsParser();
        final CommandLineArgsParserResult parserResult = commandLineArgsParser.parseArgs(args);
        final TestClassValidation classValidation = new TestClassValidation();
        final TestInfoPrinter testInfoPrinter = new TestInfoPrinterImpl();
        testInfoPrinter.printNoSuchClass(parserResult.getErrorClasses());
        final TestRunner testRunner = new TestRunner(classValidation, testInfoPrinter);
        testRunner.runTest(parserResult.getTestClasses());
        //org.jugru.minijunit.testpackage.ExampleTest
    }
}
