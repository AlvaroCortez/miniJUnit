package org.jugru.minijunit.test;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTestJUnitTest {

    @Test
    public void goodTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void goodTest_second() {
        Assert.assertTrue(true);
    }

    @Test
    public void goodTest_third() {
        Assert.assertTrue(false);
    }

//    @Test
//    private void badTest_private() {
//
//    }
//
//    @Test
//    public String badTest_returnString() {
//        return null;
//    }
//
//    @Test
//    public void badTest_hasArgument(String arg) {
//
//    }
//
//    @Test
//    public static void badTest_static() {
//
//    }
}
