package org.jugru.minijunit.assertion;

public class Assert {

    public static void assertTrue(boolean condition) {
        assertTrue(condition, null);
    }

    public static void assertTrue(boolean condition, String message) {
        AssertTrue.assertTrue(condition, message);
    }

    public static void assertFalse(boolean condition) {
        assertFalse(condition, null);
    }

    public static void assertFalse(boolean condition, String message) {
        AssertFalse.assertFalse(condition, message);
    }

    public static void assertNull(boolean condition) {
        assertNull(condition, null);
    }

    public static void assertNull(boolean condition, String message) {
        AssertNull.assertNull(condition, message);
    }

    public static void assertNotNull(boolean condition) {
        assertNotNull(condition, null);
    }

    public static void assertNotNull(boolean condition, String message) {
        AssertNonNull.assertNonNull(condition, message);
    }

    public static void assertSame(boolean condition) {
        assertSame(condition, null);
    }

    public static void assertSame(boolean condition, String message) {
        AssertSame.assertSame(condition, message);
    }

    public static void assertEquals(byte expected, byte actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(byte expected, byte actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Byte expected, byte actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Byte expected, byte actual, String message) {
        AssertEquals.assertEquals(expected, (Byte) actual, message);
    }

    public static void assertEquals(byte expected, Byte actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(byte expected, Byte actual, String message) {
        AssertEquals.assertEquals(((Byte) expected), actual, message);
    }

    public static void assertEquals(Byte expected, Byte actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Byte expected, Byte actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(char expected, char actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(char expected, char actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Character expected, char actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Character expected, char actual, String message) {
        AssertEquals.assertEquals(expected, (Character) actual, message);
    }

    public static void assertEquals(char expected, Character actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(char expected, Character actual, String message) {
        AssertEquals.assertEquals(((Character) expected), actual, message);
    }

    public static void assertEquals(Character expected, Character actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Character expected, Character actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(short expected, short actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(short expected, short actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Short expected, short actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Short expected, short actual, String message) {
        AssertEquals.assertEquals(expected, (Short) actual, message);
    }

    public static void assertEquals(short expected, Short actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(short expected, Short actual, String message) {
        AssertEquals.assertEquals(((Short) expected), actual, message);
    }

    public static void assertEquals(Short expected, Short actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Short expected, Short actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(int expected, int actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(int expected, int actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Integer expected, int actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Integer expected, int actual, String message) {
        AssertEquals.assertEquals(expected, (Integer) actual, message);
    }

    public static void assertEquals(int expected, Integer actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(int expected, Integer actual, String message) {
        AssertEquals.assertEquals(((Integer) expected), actual, message);
    }

    public static void assertEquals(Integer expected, Integer actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Integer expected, Integer actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(long expected, long actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(long expected, long actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Long expected, long actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Long expected, long actual, String message) {
        AssertEquals.assertEquals(expected, (Long) actual, message);
    }

    public static void assertEquals(long expected, Long actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(long expected, Long actual, String message) {
        AssertEquals.assertEquals(((Long) expected), actual, message);
    }

    public static void assertEquals(Long expected, Long actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Long expected, Long actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(float expected, float actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(float expected, float actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Float expected, float actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Float expected, float actual, String message) {
        AssertEquals.assertEquals(expected, (Float) actual, message);
    }

    public static void assertEquals(float expected, Float actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(float expected, Float actual, String message) {
        AssertEquals.assertEquals(((Float) expected), actual, message);
    }

    public static void assertEquals(Float expected, Float actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Float expected, Float actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(double expected, double actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(double expected, double actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Double expected, double actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Double expected, double actual, String message) {
        AssertEquals.assertEquals(expected, (Double) actual, message);
    }

    public static void assertEquals(double expected, Double actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(double expected, Double actual, String message) {
        AssertEquals.assertEquals(((Double) expected), actual, message);
    }

    public static void assertEquals(Double expected, Double actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Double expected, Double actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }

    public static void assertEquals(Object expected, Object actual) {
        assertEquals(expected, actual, null);
    }

    public static void assertEquals(Object expected, Object actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }
}
