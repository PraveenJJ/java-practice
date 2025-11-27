package com.problem.practice.questions;

import com.problem.practice.questions.utils.Helper;

/**
 * To print Fibonacci series
 * set --> a = 0
 * set --> b = 1
 * logic --> nextTerm = a + b
 * swap --> a = b
 * swap --> b = nextTerm
 * repeat logic till n iterations
 * print --> nextTerm as per n
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
