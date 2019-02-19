package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Consequtive_numTest {
    Consequtive_num cn;

    @Before
    public void setUp() throws Exception {
        cn=new Consequtive_num();
    }

    @After
    public void tearDown() throws Exception {
        cn=null;
    }

    @Test
    public void checkcons() {
        boolean expected = false;

        boolean actual = cn.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actual);
    }
    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = cn.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = cn.checkConsecutive("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }
}