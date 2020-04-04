package com.rajat.problems;

public class LongestSubstringPalindrome {

    /**
     * Longest substring palindrome
     *
     * Divide and conquer approach
     *
     * */
    public int longestSubStringPalindrome(String s, int startIndex, int lastIndex ) {

        int val1 = 0;
        int val2 = 0;
        int val3 = 0;

        if(startIndex == lastIndex){
            return 1;
        }
        if(startIndex > lastIndex) {
            return 0;
        }
        int c = 0;

        if(s.charAt(startIndex) == s.charAt(lastIndex)) {
            c = lastIndex - startIndex - 1;
            if(c == longestSubStringPalindrome(s, startIndex + 1, lastIndex - 1) ) {
                val1 = 2 + c;
            }
        }
            val2 = longestSubStringPalindrome(s, startIndex , lastIndex - 1);
            val3 = longestSubStringPalindrome(s, startIndex + 1 , lastIndex);

            return Math.max(val1, Math.max(val3, val2));
    }


    /**
     * Longest substring palindrome
     *
     * DP-TopDown Approach
     *
     * */
    public int lSPTopDownApproach(int[][] dp, String s, int startIndex, int lastIndex ) {

        int val1 = 0;
        int val2 = 0;
        int val3 = 0;

        if(startIndex == lastIndex){
            return 1;
        }
        if(startIndex > lastIndex) {
            return 0;
        }
        int c = 0;

        if(dp[startIndex][lastIndex] == 0) {
            if(s.charAt(startIndex) == s.charAt(lastIndex)) {
                c = lastIndex - startIndex - 1;
                if(c == longestSubStringPalindrome(s, startIndex + 1, lastIndex - 1) ) {
                    val1 = 2 + c;
                }
            }
            val2 = longestSubStringPalindrome(s, startIndex , lastIndex - 1);
            val3 = longestSubStringPalindrome(s, startIndex + 1 , lastIndex);
            dp[startIndex][lastIndex] =  Math.max(val1, Math.max(val3, val2));
        }
        return dp[startIndex][lastIndex];
    }
}
