package org.jugru.minijunit.assertion;

import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertSame {
    private static final String EXPECTED_SAME = "expected: <null>";

    static void assertSame(Object expected, Object actual) {
        assertSame(expected, actual, null);
    }

    static void assertSame(Object expected, Object actual, String message) {
        if (expected != actual) {
            fail(message, expected, actual);
        }
    }

    private AssertSame() {}
}
