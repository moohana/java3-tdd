//// Write a program to set up an array of places, Loop round and remove the vowels. Display the new
////words in console
package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfplacesTest {
    ArrayOfplaces app;

    @Before
    public void setUp() throws Exception {
        app=new ArrayOfplaces();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void check() {
        String[] in={"India","Germany","america"};
        String[] out={"Ind","Grmny","mrc"};
        assertArrayEquals(out,app.check(in));
    }
    public void check1() {
        String[] in={"India","Germany","america"};
        String[] out={"Ind","","mrc"};
        assertArrayEquals(out,app.check(in));
    }
    public void check3() {
        String[] in={"India","Germany","america"};
        String[] out={"Ind","",""};
        assertArrayEquals(out,app.check(in));
    }
    public void check4() {
        String[] in={"India","Germany","america"};
        String[] out={"Ind1","","mrc3"};
        assertArrayEquals(out,app.check(in));
    }
}