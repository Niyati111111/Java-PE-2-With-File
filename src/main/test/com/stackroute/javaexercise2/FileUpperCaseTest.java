package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FileUpperCaseTest {

    FileUpperCase fileUpperCase;

    @Before
    public void setUp() {

        fileUpperCase = new FileUpperCase();
    }

    @After
    public void tearDown() {

        fileUpperCase = null;
    }

    @Test
    public void GivenFileNameDisplaysInUppercase() throws Exception {
        String filename = "/home/niyati/Rob.txt";
        String result = fileUpperCase.convertToUpperCase(filename);
        //String expected = "HI THERE ROB";
        assertEquals("HI THERE ROB\n\n",result);

    }


}