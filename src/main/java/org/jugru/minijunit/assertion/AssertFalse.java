package org.jugru.minijunit.assertion;

import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertFalse {

    private static final String EXPECTED_FALSE = "expected: <false> but was: <true>";

    static void assertFalse(boolean condition) {
        assertFalse(condition, null);
    }

    static void assertFalse(boolean condition, String message) {
        if (condition) {
            fail(buildPrefix(message) + EXPECTED_FALSE);
        }
    }

    private AssertFalse() {}
}
