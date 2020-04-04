package com.rajat_coding;

import com.rajat.problems.*;

public class Main {

    public static void main(String[] args) {
        int[] a = {6, 7, 1, 30, 8, 2, 4};
        int[] b = {20, 5, 1, 13, 6, 11, 40};
        HouseTheif x = new HouseTheif();
        System.out.println(x.houseTheif(0, a));
        System.out.println(x.houseTheif(0, b));
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

//        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
//
//        System.out.println("Execution time in milliseconds : " +
//                timeElapsed / 1000000);


        /**
         * Convert one String to Another
         *
         * */
        ConvertOneStringToAnother convertOneStringToAnother= new ConvertOneStringToAnother();
        System.out.println("resultConvertOneStringToAnother");
        System.out.println(convertOneStringToAnother.convertOneStringToAnother("table", "tbres", 0, 0));
        System.out.println(convertOneStringToAnother.convertOneStringToAnotherDnQTopDown("table", "tbres", 0, 0));


        /**
         * 0/1 KnapSack problem
         *
         * */
        KnapSackProblem knapSackProblem = new KnapSackProblem();
        System.out.println("Knap-sack problem");
        int[] weight = {3, 1, 5, 2};
        int[] profit = {31, 26, 72, 17};
        int capacity = 7;
        System.out.println( knapSackProblem.knapSackProblem(weight, profit, capacity, 0));

        /**
         * LongestSubsequenceSubstring
         *
         * */
        LongestSubsequenceSubstring longestSubsequenceSubstring = new LongestSubsequenceSubstring();
        System.out.println("LongestSubsequenceSubstring");
        String s1  = "elephant";
        String s2 = "eretpat";
        System.out.println(longestSubsequenceSubstring.longestSubsequenceString(s1, s2, 0, 0));
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        System.out.println(longestSubsequenceSubstring.subSeqString(dp, s1, s2, 0, 0));

        /**
         * LongestPalindromeSubsequence
         *
         * */
        LongestSubsequencePalindrome lSP = new LongestSubsequencePalindrome();
        String str  = "elephant";
        System.out.println(lSP.longestSubSequencePalindrome(str, 0, str.length() - 1));
        int[][] dp1 = new int[str.length() + 1][str.length() + 1];
        System.out.println(lSP.lPSTopDownApproach(dp1, str, 0, str.length() - 1));

        /**
         * LongestSubstringPalindrome
         *
         * */
        String ex1 = "ABCCBUA";
        LongestSubstringPalindrome lSS = new LongestSubstringPalindrome();
        System.out.println(lSS.longestSubStringPalindrome(ex1, 0, ex1.length() - 1));
        int[][] dp2 = new int[ex1.length() + 1][ex1.length() + 1];
        System.out.println(lSS.lSPTopDownApproach(dp2, ex1, 0, ex1.length() - 1));



    }
}
