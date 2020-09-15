package org.jugru.minijunit.assertion;

import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertTrue {
    private static final String EXPECTED_TRUE = "expected: <true> but was: <false>";

    static void assertTrue(boolean condition) {
        assertTrue(condition, null);
    }

    static void assertTrue(boolean condition, String message) {
        if (!condition) {
            fail(buildPrefix(message) + EXPECTED_TRUE);
        }
    }

    private AssertTrue() {}
}
