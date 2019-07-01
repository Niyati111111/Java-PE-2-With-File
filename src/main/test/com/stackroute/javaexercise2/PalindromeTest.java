package com.stackroute.javaexercise2;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() {
        System.out.println("Before");
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        palindrome = null;
    }

    @Test
    public void givenPalindromeStringShouldReturnPalindrome() {
        //arrange

        //act
        String result = palindrome.checkPalindrome("madam");
        //assert
        assertEquals("palindrome",result);
    }

    @Test
    public void givenPalindromeString1ShouldReturnPalindrome() {
        //arrange

        //act
        String result = palindrome.checkPalindrome("maddam");
        //assert
        assertEquals("palindrome",result);
    }

    @Test
    public void givenNonPalindromeStringShouldReturnNonPalindrome() {
        //arrange

        //act
        String result = palindrome.checkPalindrome("man");
        //assert
        assertEquals("not palindrome",result);
    }
}




