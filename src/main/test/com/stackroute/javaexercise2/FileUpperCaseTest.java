package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class FileUpperCaseTest {

    FileUpperCase fileUpperCase;

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
        fileUpperCase = new FileUpperCase();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        fileUpperCase = null;
    }

    @Test
    public void GivenFileNameDisplaysInUppercase() {
        String filename = "/home/niyati/Rob.txt";
        fileUpperCase.convertToUpperCase(filename);

    }


}