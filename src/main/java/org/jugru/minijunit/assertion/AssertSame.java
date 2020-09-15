package org.jugru.minijunit.assertion;

import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertSame {
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
