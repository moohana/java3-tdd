package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessboardTest {
Chessboard cb;
    @Before
    public void setUp() throws Exception {
        cb=new Chessboard();
    }

    @After
    public void tearDown() throws Exception {
        cb=null;
    }

    @Test
    public void display() {



            String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

            String [][] actual = cb.display(8,8);

            assertNotEquals("Following is chessPattern output",expected,actual);
        }

    }