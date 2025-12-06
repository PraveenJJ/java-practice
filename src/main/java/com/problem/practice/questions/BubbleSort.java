package com.problem.practice.questions;

import java.util.Arrays;

/**
 * Bubble sort works by repeatedly comparing adjacent elements
 * swapping them if they are in the wrong order. You keep looping over the list until
 * no more swaps are needed, meaning the list is sorted.
 * At line 23, we subtract i cuz after the first pass the largest number moves to the end,
 * so we don’t need to compare it again in future passes.
 * Problem: https://prepinsta.com/interview-preparation/technical-interview-questions/most-asked-coding-questions-in-placements/
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] num = {5, 3, 8, 4, 2};
        performBubbleSort(num);
    }

    private static void performBubbleSort(int[] num) {
        System.out.println("Input: " + Arrays.toString(num));
        for (int i = 0; i < num.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Output: " + Arrays.toString(num));
    }

}
