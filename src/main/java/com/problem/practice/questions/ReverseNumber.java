package com.problem.practice.questions;

import com.problem.practice.questions.utils.Helper;

/**
 * To reverse a number
 * divide number by 10
 * remainder will give last digit
 * concatenate to an empty string
 * quotient will give number excluding last digit
 * use the quotient as new number & repeat until quotient is finally 0
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int inputNumber = Helper.getNumberInputFromUser();
        System.out.println("Reversed number: " + reverseNumber(inputNumber));
    }

    private static String reverseNumber(int inputNumber) {
        String reveredString = "";
        while (inputNumber != 0) {
            // remainder will be last digit
            int lastDigit = inputNumber % 10;

            // concatenate lastDigit
            reveredString = reveredString + lastDigit;

            // quotient excludes last digit
            inputNumber = inputNumber / 10;
        }
        return reveredString;
    }

}
