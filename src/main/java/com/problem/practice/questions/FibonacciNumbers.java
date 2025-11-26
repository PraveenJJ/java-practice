package com.problem.practice.questions;

import com.problem.practice.questions.utils.Helper;

/**
 * Fibonacci series pattern
 * initialize a = 0
 * initialize b = 1
 * logic --> nextTerm = a + b
 * Print nextTerm
 * set a = b
 * set b = nextTerm
 * repeat logic
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        int n = Helper.getNumberInputFromUser();
        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.print("Invalid value for n");
        } else if (n == 1) {
            System.out.print(a);
        } else if (n == 2) {
            System.out.print(a + ", " + b);
        } else {
            System.out.print(a + ", " + b);
            for (int i = 2; i < n; i++) {
                int nextNum = a + b;
                System.out.print(", " + nextNum);
                a = b;
                b = nextNum;
            }
        }
    }

}
