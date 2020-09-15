package org.jugru.minijunit.logging;

import org.jugru.minijunit.dto.TestClassResult;

import java.io.PrintStream;
import java.util.List;

public interface TestInfoPrinter {
    void printErrors(List<Exception> exceptions);

    void printTestClassResult(List<TestClassResult> testClassResults);

    void printNoSuchClass(List<String> classes);
}
