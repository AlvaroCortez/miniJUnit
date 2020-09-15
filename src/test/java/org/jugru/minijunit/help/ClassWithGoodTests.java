package org.jugru.minijunit.help;

import org.jugru.minijunit.annotation.Test;
import org.jugru.minijunit.assertion.Assert;

public class ClassWithGoodTests {

    @Test
    public void goodTest() {

    }

    @Test
    public void goodTest_second() {
        Assert.assertTrue(true);
    }

    @Test
    public void goodTest_failed() {
        Assert.assertTrue(false);
    }

    public void noTest() {

    }
}
