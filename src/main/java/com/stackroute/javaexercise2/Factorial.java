package com.stackroute.javaexercise2;

public class Factorial {

       public int[] intFactorial() {

           int number  = 1;
           int factorial = 1;
           while (true)
           {

               if (Integer.MAX_VALUE / factorial < (number+1)) {
                   System.out.printf("The factorial of %d is out of range.\n", (number+1));
                   break;
               }
               number++;
               factorial *= number;
           }

           int factorialArray[] = new int[number];
           for(int j=0;j<number;++j){
               factorialArray[j] = j+1;
           }
           return factorialArray;
       }

    public long[] longFactorial() {

        long number  = 1;
        long factorial = 1;
        while (true)
        {

            if (Long.MAX_VALUE / factorial < (number+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (number+1));
                break;
            }
            number++;
            factorial *= number;
        }

        long factorialArray[] = new long[20];
        for(int j=0;j<number;++j){
            factorialArray[j] = j+1;
        }
        return factorialArray;
    }



}
