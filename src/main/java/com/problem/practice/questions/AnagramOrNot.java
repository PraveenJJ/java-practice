package com.problem.practice.questions;

import com.problem.practice.utils.Helper;

import java.util.Arrays;

/**
 * If rearranging the letters of 1st word forms 2nd word
 * then the two words can be called Anagrams.
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class AnagramOrNot {

    public static void main(String[] args) {
        String firstWord = Helper.getStringInputFromUser();
        String secondWord = Helper.getStringInputFromUser();
        if (isAnagram(firstWord, secondWord)) {
            System.out.println(firstWord + " & " + secondWord + " are Anagrams");
        } else {
            System.out.println(firstWord + " & " + secondWord + " are not Anagrams");
        }
    }

    private static boolean isAnagram(String firstWord, String secondWord) {
        char[] firstWordCharArray = firstWord.toCharArray();
        char[] secondWordCharArray = secondWord.toCharArray();
        Arrays.sort(firstWordCharArray);
        Arrays.sort(secondWordCharArray);
        return Arrays.equals(firstWordCharArray, secondWordCharArray);
    }

}
