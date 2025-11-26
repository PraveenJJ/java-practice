package com.problem.practice.questions.utils;

import java.util.Scanner;

public class Helper {
    public static int getNumberInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }
}
