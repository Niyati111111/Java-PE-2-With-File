package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour powerOfFour;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Before class");

    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("After class");

    }


    @Before
    public void setUp() {
        System.out.println("Before");
        powerOfFour = new PowerOfFour();
    }

    @After
    public void tearDown() {
        System.out.println("After");
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