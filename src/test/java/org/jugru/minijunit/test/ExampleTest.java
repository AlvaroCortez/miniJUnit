package org.jugru.minijunit.test;

import org.jugru.minijunit.annotation.Test;

public class ExampleTest {

    @Test
    public void goodTest() {

    }

    @Test
    private void badTest_private() {

    }

    @Test
    public String badTest_returnString() {
        return null;
    }

    @Test
    public void badTest_hasArgument(String arg) {

    }

    @Test
    public static void badTest_static() {

    }
}
