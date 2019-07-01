package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour powerOfFour;

    @Before
    public void setUp() {

        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() {

        powerOfFour = null;
    }

    @Test
    public void GivenPowerOfFourShouldReturn1() {

        int result = powerOfFour.isPowerOfFour(16);

        assertEquals(1,result);

    }

    @Test
    public void GivenAnotherPowerOfFourShouldReturn1() {

        int result = powerOfFour.isPowerOfFour(64);

        assertEquals(1,result);

    }

    @Test
    public void GivenNotAPowerOfFourShouldReturn0() {

        int result = powerOfFour.isPowerOfFour(25);

        assertEquals(0,result);

    }



}