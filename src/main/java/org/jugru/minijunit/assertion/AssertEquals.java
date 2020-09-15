package org.jugru.minijunit.assertion;

import static java.util.Objects.isNull;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertEquals {

    static void assertEquals(byte expected, byte actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(byte expected, byte actual, String message) {
        if (expected != actual) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(char expected, char actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(char expected, char actual, String message) {
        if (expected != actual) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(short expected, short actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(short expected, short actual, String message) {
        if (expected != actual) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(int expected, int actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(long expected, long actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(long expected, long actual, String message) {
        if (expected != actual) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(float expected, float actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(float expected, float actual, String message) {
        if (Float.compare(expected, actual) != 0) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(double expected, double actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(double expected, double actual, String message) {
        if (Double.compare(expected, actual) != 0) {
            fail(message, expected, actual);
        }
    }

    static void assertEquals(Object expected, Object actual) {
        assertEquals(expected, actual, null);
    }

    static void assertEquals(Object expected, Object actual, String message) {
        if (isNull(expected) || isNull(actual) || !expected.equals(actual)) {
            fail(message, expected, actual);
        }
    }

    private AssertEquals() {}
}
