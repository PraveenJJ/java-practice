package com.problem.practice.questions;

import com.problem.practice.utils.Helper;

/**
 * To find GCD for 2 numbers
 * logic --> temp = num1 % num2
 * swap --> num1 = num2
 * swap --> num2 = temp
 * repeat logic till temp != 0
 * result --> num1
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class FindGCD {

    public static void main(String[] args) {
        int num1 = Helper.getNumberInputFromUser();
        int num2 = Helper.getNumberInputFromUser();
        System.out.println("GCD for (" + num1 + ", " + num2 + ") is " + determineGCD(num1, num2));
    }

    private static int determineGCD(int num1, int num2) {
        int temp = 1;
        while (temp != 0) {
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

}
