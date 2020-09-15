package org.jugru.minijunit.assertion;

import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertNonNull {
    private static final String EXPECTED_NOT_NULL = "expected: not <null>";

    static void assertNonNull(Object object) {
        assertNonNull(object, null);
    }

    static void assertNonNull(Object object, String message) {
        if (object == null) {
            fail(buildPrefix(message + EXPECTED_NOT_NULL));
        }
    }

    private AssertNonNull() {}
}
