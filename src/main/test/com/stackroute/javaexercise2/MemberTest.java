package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class MemberTest {

    Member member;

    @Before
    public void setUp() {

        member = new Member();
    }

    @After
    public void tearDown() {

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