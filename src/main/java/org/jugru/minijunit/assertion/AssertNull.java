package org.jugru.minijunit.assertion;

import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertNull {
    private static final String EXPECTED_NULL = "expected: <null>";

    static void assertNull(Object object) {
        assertNull(object, null);
    }

    static void assertNull(Object object, String message) {
        if (object != null) {
            fail(buildPrefix(message + EXPECTED_NULL));
        }
    }

    private AssertNull() {}
}
