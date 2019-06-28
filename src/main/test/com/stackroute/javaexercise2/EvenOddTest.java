package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenOdd;

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
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        evenOdd = null;
    }

    @Test
    public void InputEvenReturnTrue(){
        boolean result = evenOdd.isEven(6);
        assertEquals(true,result);
    }

    @Test
    public void InputAnotherEvenReturnTrue(){
        boolean result = evenOdd.isEven(28);
        assertEquals(true,result);
    }

    @Test
    public void InputOddReturnFalse(){
        boolean result = evenOdd.isEven(13);
        assertEquals(false,result);
    }



}