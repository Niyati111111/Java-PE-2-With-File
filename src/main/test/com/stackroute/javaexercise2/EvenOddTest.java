package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd evenOdd;

    @Before
    public void setUp() {
        evenOdd = new EvenOdd();
    }

    @After
    public void tearDown() {

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