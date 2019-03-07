package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern obj;
    @Before
    public void setUp() throws Exception {
        obj = new Pattern();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void wordRev() {
        assertEquals("1223334444555556666667777777",obj.printPattern(7));
        assertEquals("122333",obj.printPattern(3));
    }
}
