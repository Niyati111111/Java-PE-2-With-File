package com.stackroute.javaexercise2;

public class PowerOfFour {

    public int isPowerOfFour(int number)
    {
        if(number == 0)
            return 0;
        while(number != 1)
        {
            if(number % 4 != 0)
                return 0;
            number = number / 4;
        }
        return 1;
    }

}
