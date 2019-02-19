package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {
    MyDate md;

    @Before
    public void setUp() throws Exception {
        md=new MyDate();
    }

    @After
    public void tearDown() throws Exception {
        md=null;
    }

    @Test
    public void startDate() {
        boolean expectedValue = true;
        //Act
        boolean actualValue = md.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = md.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}