package com.problem.practice.questions;

import com.problem.practice.utils.Helper;

/**
 * A number is a divisor if the remainder is zero.
 * A number is a Perfect number if the sum of all
 * it's divisors(excluding the number) is the number itself.
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class PerfectNumber {

    public static void main(String[] args) {
        int num1 = Helper.getNumberInputFromUser();
        if (isPerfectNumber(num1)) {
            System.out.println(num1 + " is a Perfect Number");
        } else {
            System.out.println(num1 + " is not a Perfect Number");
        }
    }

    private static boolean isPerfectNumber(int num1) {
        int sum = 0;
        for (int i = 1; i < num1; i++) {
            // add if 'i' is a divisor
            if (num1 % i == 0) {
                sum = sum + i;
            }
        }
        return sum == num1;
    }

}
