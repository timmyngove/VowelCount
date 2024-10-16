/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countvowels;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class CountVowels {

    public static int countVowels(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase(); // Convert the sentence to lowercase for case-insensitive comparison

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (isVowel(currentChar)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1; // Check for the characters
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();   


        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);   

    }
}
