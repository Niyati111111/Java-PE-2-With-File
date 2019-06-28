package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;

public class MemberTest {

    Member member;

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
        member = new Member();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        member = null;
    }

    @Test
    public void inputNameReturnName(){

        member.setName("Mia");
        String result = member.getName();
        assertEquals("Mia",result);


    }

    @Test
    public void inputAgeReturnAge() {

        member.setAge(25);
        int result = member.getAge();
        assertEquals(25,result);
    }

    @Test
    public void inputSalaryGetSalary() {

        member.setSalary(15000);
        int result = member.getSalary();
        assertEquals(15000,result);

    }
}