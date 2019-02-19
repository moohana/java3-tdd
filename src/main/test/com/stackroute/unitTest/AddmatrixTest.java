package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddmatrixTest {
    Addmatrix add;

    @Before
    public void setUp() throws Exception {
        add=new Addmatrix();
    }

    @After
    public void tearDown() throws Exception {
        add=null;
    }

    @Test
    public void checkmatrix() {
        int[][] out={{10,10,10},{10,10,10}};
        int[][] in1={{1,2,3},{4,5,6}};
        int[][] in2={{9,8,7},{6,5,4}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
    public void checkmatrix1() {
        int[][] out={{0,0,0},{0,0,0}};
        int[][] in1={{1,2,3},{4,5,6}};
        int[][] in2={{9,8,7},{6,5,4}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
    public void checkmatrix2() {
        int[][] out={{10,10,10},{10,10,10}};
        int[][] in1={{1,2},{4,5}};
        int[][] in2={{9,8,7},{6,5,4}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
    public void checkmatrix3() {
        int[][] out={{10,10,10},{10,10,10}};
        int[][] in1={{1,2,3},{4,5,6}};
        int[][] in2={{9,8},{6,5}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
    public void checkmatrix4() {
        int[][] out={{10,10,10},{10,10,10}};
        int[][] in1={{1,2,0},{4,5,6}};
        int[][] in2={{9,8,7},{6,5,0}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
    public void checkmatrix5() {
        int[][] out={{10,10,10},{10,10,10}};
        int[][] in1={{1,2,3},{4,5,6}};
        int[][] in2={{0,0,0},{0,0,0}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
    public void checkmatrix6() {
        int[][] out={{10,10,10},{10,10,10}};
        int[][] in1={{0,0,0},{0,0,0}};
        int[][] in2={{9,8,7},{6,5,4}};
        assertArrayEquals(out,add.checkmatrix(in1,in2));


    }
}