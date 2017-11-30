package com.company.Katas;

//Static example
public class FizzBuzz {

    public static String getAnswer(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        }
        else if (number % 5 == 0) {
            return "buzz";
        }
        else if(number % 3 == 0) {
            return "fizz";
        }
        else {
            return Integer.toString(number);
        }
    }
}
