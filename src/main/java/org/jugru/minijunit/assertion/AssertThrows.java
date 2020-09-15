package org.jugru.minijunit.assertion;

import static java.lang.String.format;
import static org.jugru.minijunit.assertion.AssertUtils.buildPrefix;
import static org.jugru.minijunit.assertion.AssertUtils.fail;

public class AssertThrows {

    private static final String EXPECTED_EXCEPTION = "expected %s to be thrown but got nothing";

    @FunctionalInterface
    public interface Executable {
        void execute() throws Throwable;
    }

    static <T extends Throwable> T assertThrows(Class<T> expected, Executable executable) {
        return assertThrows(expected, executable, null);
    }

    @SuppressWarnings("unchecked")
    static <T extends Throwable> T assertThrows(Class<T> expected, Executable executable, String message) {
        try {
            executable.execute();
        } catch (Throwable actual) {
            if (expected.isInstance(actual)) {
                return (T) actual;
            } else {
                fail(message, expected, actual);
            }
        }

        throw new AssertionError((buildPrefix(message) + format(EXPECTED_EXCEPTION, expected)));
    }
}
