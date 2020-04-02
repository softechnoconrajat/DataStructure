package com.rajat_coding;

import com.rajat.problems.ConvertOneStringToAnother;
import com.rajat.problems.HouseTheif;
import com.rajat.problems.KnapSackProblem;
import com.rajat.problems.LongestSubsequenceSubstring;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {6, 7, 1, 30, 8, 2, 4};
        int[] b = {20, 5, 1, 13, 6, 11, 40};
        HouseTheif x = new HouseTheif();



        System.out.println(x.houseTheif(0, a));


        System.out.println(x.houseTheif(0, b));


        long startTime = System.nanoTime();
//        System.out.println(x.houseTheifDnP(0, a));
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
//       int resultConvertOneStringToAnother = convertOneStringToAnother.convertOneStringToAnother("table", "tbres", 0, 0);

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

//        LongestSubsequenceSubstring

        /**
         * LongestSubsequenceSubstring
         *
         * */

        LongestSubsequenceSubstring longestSubsequenceSubstring = new LongestSubsequenceSubstring();

        System.out.println("LongestSubsequenceSubstring");

        String s1  = "elephant";
        String s2 = "eretpat";


        System.out.println(longestSubsequenceSubstring.longestSubsequenceString(s1, s2, 0, 0));

        int[][] dp = new int[s1.length()][s2.length()];

        System.out.println(longestSubsequenceSubstring.subSeqString(dp, s1, s2, 0, 0));



    }
}
