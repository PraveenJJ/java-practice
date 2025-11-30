package com.problem.practice.questions;

import com.problem.practice.utils.Helper;

import java.util.Arrays;

/**
 * If reversing a word gives the same word
 * then the word can be called a Palindrome.
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class Palindrome {

    public static void main(String[] args) {
        String inputWord = Helper.getStringInputFromUser();
        if (isPalindrome(inputWord)) {
            System.out.println(inputWord + " is a Palindrome.");
        } else {
            System.out.println(inputWord + " is not a Palindrome.");
        }
    }

    private static boolean isPalindrome(String inputWord) {
        String reversedWord = "";
        for (int i = inputWord.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + inputWord.charAt(i);
        }
        return reversedWord.equals(inputWord);
    }

}
