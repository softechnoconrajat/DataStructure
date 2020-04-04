package com.rajat.problems;

public class LongestSubsequencePalindrome {


    /**
     *
     * Divide and Conquer Approach
     *
     * */
    public int longestSubSequencePalindrome(String s, int startIndex, int lastIndex){

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        if(startIndex == lastIndex){
            return 1;
        }

        if(startIndex > lastIndex){
            return 0;
        }

        if(s.charAt(startIndex) == s.charAt(lastIndex)) {
            count1 = 2 + longestSubSequencePalindrome(s, startIndex + 1, lastIndex - 1);
        } else {
            count2 = longestSubSequencePalindrome(s, startIndex , lastIndex - 1);
            count3 = longestSubSequencePalindrome(s, startIndex + 1, lastIndex);
        }

        return Math.max(count1, Math.max(count2, count3));
    }


    /**
     * Longest Palindrome Subsequence
     *
     * DP Top-Down approach
     *
     * */

    public int lPSTopDownApproach(int[][] dp, String s, int startIndex, int lastIndex){

        int val1 = 0;
        int val2= 0;
        int val3 = 0;

        if(startIndex == lastIndex){
            return 1;
        }

        if(startIndex > lastIndex){
            return 0;
        }

        if(dp[startIndex][lastIndex] == 0){
            if(s.charAt(startIndex) == s.charAt(lastIndex)){
                val1 = 2 + lPSTopDownApproach(dp, s, startIndex +1, lastIndex - 1);
            } else {

                val2 = lPSTopDownApproach(dp, s, startIndex , lastIndex - 1);
                val3 = lPSTopDownApproach(dp, s, startIndex +1, lastIndex);
            }
            dp[startIndex][lastIndex] = Math.max(val1, Math.max(val2, val3));
            return dp[startIndex][lastIndex];

        } else {
            return dp[startIndex][lastIndex];

        }
    }
}
