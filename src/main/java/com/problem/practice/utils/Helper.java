package com.problem.practice.utils;

import java.util.Scanner;

public class Helper {
    public static int getNumberInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }

    public static String getStringInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inputString = scanner.next();
        return inputString;
    }

}
