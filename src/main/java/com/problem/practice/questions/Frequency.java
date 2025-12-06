package com.problem.practice.questions;

import com.problem.practice.utils.Helper;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use LinkedHashMap to store characters & their frequencies, & maintain insertion order.
 * Use getOrDefault(ch, 0) in Map --> if key is present, return the value stored
 * or return default value
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class Frequency {

    public static void main(String[] args) {
        String inputWord = Helper.getStringInputFromUser();
        findFrequency(inputWord);
    }

    private static void findFrequency(String inputWord) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // determining frequency of each character
        for (char ch : inputWord.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // printing the frequency
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            } else {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " time");
            }
        }
    }

}
