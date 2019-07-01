package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import static org.junit.Assert.*;

public class ByteArrayTest {

    ByteArray byteArray;

    @Before
    public void setUp() {
        byteArray = new ByteArray();
    }

    @After
    public void tearDown() {
        byteArray = null;
    }

    @Test
    public void returnsByteArray() throws Exception {
        //Arrange
        int expectedValue=1;
        int actualValue=0;

        String str="Hi there Rob";
        byte[] bytearr1= str.getBytes();
        byte[] bytearr2;

        //Act
        bytearr2=byteArray.byteFileContent("/home/niyati/Rob.txt");
        //Assert
        if (Arrays.equals(bytearr1, bytearr2))
        {
            actualValue=1;
        }
        assertEquals(expectedValue, actualValue);
        

    }

}
