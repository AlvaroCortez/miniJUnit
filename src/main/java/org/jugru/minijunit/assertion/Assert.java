package org.jugru.minijunit.assertion;

public class Assert {

    public static void assertTrue(boolean condition) {
        AssertTrue.assertTrue(condition);
    }

    public static void assertTrue(boolean condition, String message) {
        AssertTrue.assertTrue(condition, message);
    }

    public static void assertFalse(boolean condition) {
        AssertFalse.assertFalse(condition);
    }

    public static void assertFalse(boolean condition, String message) {
        AssertFalse.assertFalse(condition, message);
    }

    public static void assertNull(Object object) {
        AssertNull.assertNull(object);
    }

    public static void assertNull(Object object, String message) {
        AssertNull.assertNull(object, message);
    }

    public static void assertNotNull(Object object) {
        AssertNonNull.assertNonNull(object);
    }

    public static void assertNotNull(Object object, String message) {
        AssertNonNull.assertNonNull(object, message);
    }

    public static void assertSame(Object expected, Object actual) {
        AssertSame.assertSame(expected, actual);
    }

    public static void assertSame(Object expected, Object actual, String message) {
        AssertSame.assertSame(expected, actual, message);
    }

    public static void assertEquals(byte expected, byte actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(byte expected, byte actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Byte expected, byte actual) {
        AssertEquals.assertEquals(expected, ((Byte) actual));
    }

    public static void assertEquals(Byte expected, byte actual, String message) {
        AssertEquals.assertEquals(expected, (Byte) actual, message);
    }

    public static void assertEquals(byte expected, Byte actual) {
        AssertEquals.assertEquals(((Byte) expected), actual);
    }

    public static void assertEquals(byte expected, Byte actual, String message) {
        AssertEquals.assertEquals(((Byte) expected), actual, message);
    }

    public static void assertEquals(Byte expected, Byte actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Byte expected, Byte actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(char expected, char actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(char expected, char actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Character expected, char actual) {
        AssertEquals.assertEquals(expected, ((Character) actual));
    }

    public static void assertEquals(Character expected, char actual, String message) {
        AssertEquals.assertEquals(expected, (Character) actual, message);
    }

    public static void assertEquals(char expected, Character actual) {
        AssertEquals.assertEquals(((Character) expected), actual);
    }

    public static void assertEquals(char expected, Character actual, String message) {
        AssertEquals.assertEquals(((Character) expected), actual, message);
    }

    public static void assertEquals(Character expected, Character actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Character expected, Character actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(short expected, short actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(short expected, short actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Short expected, short actual) {
        AssertEquals.assertEquals(expected, ((Short) actual));
    }

    public static void assertEquals(Short expected, short actual, String message) {
        AssertEquals.assertEquals(expected, (Short) actual, message);
    }

    public static void assertEquals(short expected, Short actual) {
        AssertEquals.assertEquals(((Short) expected), actual);
    }

    public static void assertEquals(short expected, Short actual, String message) {
        AssertEquals.assertEquals(((Short) expected), actual, message);
    }

    public static void assertEquals(Short expected, Short actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Short expected, Short actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(int expected, int actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(int expected, int actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Integer expected, int actual) {
        AssertEquals.assertEquals(expected, ((Integer) actual));
    }

    public static void assertEquals(Integer expected, int actual, String message) {
        AssertEquals.assertEquals(expected, (Integer) actual, message);
    }

    public static void assertEquals(int expected, Integer actual) {
        AssertEquals.assertEquals(((Integer) expected), actual);
    }

    public static void assertEquals(int expected, Integer actual, String message) {
        AssertEquals.assertEquals(((Integer) expected), actual, message);
    }

    public static void assertEquals(Integer expected, Integer actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Integer expected, Integer actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(long expected, long actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(long expected, long actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Long expected, long actual) {
        AssertEquals.assertEquals(expected, ((Long) actual));
    }

    public static void assertEquals(Long expected, long actual, String message) {
        AssertEquals.assertEquals(expected, (Long) actual, message);
    }

    public static void assertEquals(long expected, Long actual) {
        AssertEquals.assertEquals(((Long) expected), actual);
    }

    public static void assertEquals(long expected, Long actual, String message) {
        AssertEquals.assertEquals(((Long) expected), actual, message);
    }

    public static void assertEquals(Long expected, Long actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Long expected, Long actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(float expected, float actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(float expected, float actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Float expected, float actual) {
        AssertEquals.assertEquals(expected, ((Float) actual));
    }

    public static void assertEquals(Float expected, float actual, String message) {
        AssertEquals.assertEquals(expected, (Float) actual, message);
    }

    public static void assertEquals(float expected, Float actual) {
        AssertEquals.assertEquals(((Float) expected), actual);
    }

    public static void assertEquals(float expected, Float actual, String message) {
        AssertEquals.assertEquals(((Float) expected), actual, message);
    }

    public static void assertEquals(Float expected, Float actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Float expected, Float actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(double expected, double actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(double expected, double actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Double expected, double actual) {
        AssertEquals.assertEquals(expected, ((Double) actual));
    }

    public static void assertEquals(Double expected, double actual, String message) {
        AssertEquals.assertEquals(expected, (Double) actual, message);
    }

    public static void assertEquals(double expected, Double actual) {
        AssertEquals.assertEquals(((Double) expected), actual);
    }

    public static void assertEquals(double expected, Double actual, String message) {
        AssertEquals.assertEquals(((Double) expected), actual, message);
    }

    public static void assertEquals(Double expected, Double actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Double expected, Double actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Object expected, Object actual) {
        AssertEquals.assertEquals(expected, actual);
    }

    public static void assertEquals(Object expected, Object actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static <T extends Throwable> T assertThrows(Class<T> expected, AssertThrows.Executable executable) {
        return AssertThrows.assertThrows(expected, executable);
    }

    public static <T extends Throwable> T assertThrows(Class<T> expected, AssertThrows.Executable executable, String message) {
        return AssertThrows.assertThrows(expected, executable, message);
    }
}
