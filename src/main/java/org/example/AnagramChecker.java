package org.example;

import java.util.*;

public class AnagramChecker {

    // The range of characters to consider for counting occurrences
    private static int CHARACTER_RANGE= 256;

    public static void main( String[] args ){
        String text1 = "beyonnex";
        String text2 = "xeyebonn";

        if(areAnagrams(text1,text2)){
            System.out.println(text1 + " and "+ text2 + " are anagrams.");
        }else{
            System.out.println(text1 + " and "+ text2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String text1, String text2) {

        // Remove spaces and convert to lower case
        String formattedText1 = text1.replaceAll("\\s","").toLowerCase();
        String formattedText2 = text2.replaceAll("\\s","").toLowerCase();

        if(formattedText1.length() != formattedText2.length())
            return false;

        int[] countOfChar = new int[CHARACTER_RANGE];

        for(int i=0; i<formattedText1.length();i++){
            // Count the occurrences of characters in the first text
            // and decrement the count for characters in the second text
            countOfChar[formattedText1.charAt(i)]++;
            countOfChar[formattedText2.charAt(i)]--;
        }

        // Check if there are any non-zero counts in the countOfChar array
        if(Arrays.stream(countOfChar).anyMatch(value -> value != 0))
            return false;

            return true;
    }
}
