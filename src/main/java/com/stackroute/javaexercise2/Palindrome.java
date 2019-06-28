package com.stackroute.javaexercise2;
import java.util.*;

public class Palindrome {

        public String checkPalindrome(String inputString) {


            StringBuffer stringBuffer = new StringBuffer(inputString);
            if(inputString.equals(stringBuffer.reverse().toString())) {
                return "palindrome";
            } else {
                return "not palindrome";
            }

        }

    }


