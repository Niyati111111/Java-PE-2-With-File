package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class StudentTest {
    Student student;
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
        student = new Student();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        student = null;
    }

    @Test
    public void InputNumberOfStudentsAndArrayOfMarksShouldReturnAverage() {
        int number = 5;
        int marksArray[] = {78,89,87,98,79};
        double average = student.average(number, marksArray);
        assertEquals(86.2, average, 0.00001);
    }

    @Test
    public void InputNumberOfStudentsAndArrayOfMarksShouldReturnMaximumMarks() {
        int number = 5;
        int marksArray[] = {78,89,87,98,79};
        int maximum = student.maximum(number, marksArray);
        assertEquals(98,maximum);
    }

    @Test
    public void InputNumberOfStudentsAndArrayOfMarksShouldReturnMinimumMarks() {
        int number = 5;
        int marksArray[] = {78,89,87,98,79};
        int minimum = student.minimum(number, marksArray);
        assertEquals(78,minimum);
    }

}