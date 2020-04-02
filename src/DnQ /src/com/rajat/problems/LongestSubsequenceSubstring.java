package com.rajat.problems;

public class LongestSubsequenceSubstring {

    /**
     * Normal Approach
     *
     * */
    public int longestSubsequenceString(String s1, String s2, int index1, int index2){

        if(s1.length() <= index1 || s2.length() <= index2){
            return 0;
        }
        int l1 = 0;
        int l2  = 0;
        int l3 = 0;
        if(s1.charAt(index1) == s2.charAt(index2)) {
             l1 = 1 +  longestSubsequenceString(s1,  s2,  index1 + 1,  index2 + 1);

        } else {
             l2 = longestSubsequenceString(s1,  s2,  index1 ,  index2 + 1);
             l3 = longestSubsequenceString(s1,  s2,  index1 + 1,  index2 );
        }
        return Math.max(l1, Math.max(l2, l3));
    }
    
    /**
     * DnQ Approach
     *
     * Top-Down
     *
     * */

    public int subSeqString(int[][] dp, String s1, String s2, int index1, int index2){

        if(s1.length() == index1 || s2.length() == index2){
            return 0;
        }


        int l1 = 0;
        int l2 = 0;
        int l3 = 0;

        if(s1.charAt(index1) == s2.charAt(index2)){
            l1  = 1 + subSeqString(dp, s1, s2, index1 + 1, index2 + 1);
        } else {
            l2  = subSeqString(dp, s1, s2, index1 , index2 + 1);
            l3  = subSeqString(dp, s1, s2, index1 + 1, index2);
        }
        dp[index1][index2] =  Math.max(l1, Math.max(l2, l3));
        return dp[index1][index2] ;

    }
}
