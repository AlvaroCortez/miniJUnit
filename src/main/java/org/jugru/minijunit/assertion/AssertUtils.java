package org.jugru.minijunit.assertion;

import static java.util.Objects.nonNull;

public class AssertUtils {

    static void fail() {
        throw new AssertionError();
    }

    static void fail(String message) {
        throw new AssertionError(message);
    }

    static void fail(String message, Object expected, Object actual) {
        throw new AssertionError(buildComparisonMessage(message, expected, actual));
    }

    static String buildPrefix(String message) {
        return (isNotBlank(message) ? message + " ==> " : "");
    }

    private static boolean isNotBlank(String message) {
        return nonNull(message) && !message.isBlank();
    }

    private static String buildComparisonMessage(String message, Object expected, Object actual) {
        return buildPrefix(message) + "expected:<" + expected + "> but was:<" + actual + ">";
    }
}
