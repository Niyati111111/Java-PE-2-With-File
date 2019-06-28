package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class FactorialTest {

     Factorial factorial;

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
        factorial = new Factorial();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        factorial = null;
    }

    @Test
    public void ReturnArrayOfNumbers(){
        int result[] = factorial.intFactorial();
        int expected[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        assertArrayEquals(expected,result);
    }

    @Test
    public void ReturnArrayOfLongNumbers(){
        long result[] = factorial.longFactorial();
        long expected[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        assertArrayEquals(expected,result);
    }

}