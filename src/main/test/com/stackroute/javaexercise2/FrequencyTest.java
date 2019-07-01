package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FrequencyTest {

    Frequency frequency;

    @Before
    public void setUp() {
        frequency = new Frequency();
    }

    @After
    public void tearDown() {
        frequency = null;
    }

    @Test
    public void returnsWordCount() throws Exception {
        //Arrange
        int expectedValue=3;

        //Act
        int actualValue =frequency.contentOfFileTimes("/home/niyati/Rob.txt");
        //Assert

        assertEquals(expectedValue, actualValue);

    }

}