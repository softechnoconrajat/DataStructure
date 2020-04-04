package com.rajat.problems;


/**
 * Minimum cost to reach the end of an array
 * */
public class MinCostToReachEndofArray {

    int[][] pathArray =  {{4, 7, 8, 6, 4}, {6, 7, 3, 9, 2}, {3, 8, 1, 2, 4}, {7, 1, 7, 3, 7}, {2, 9, 8, 9, 3}};

    /**
     * Min. cost to reach end of an array
     *
     * Divide and conquer Approach
     *
     * */
    public int minCostToReachEndofArray(int row, int col){
        if(row == -1 || col == -1){
            return Integer.MAX_VALUE;
        }

        if(row == 0 && col == 0 ){
            return pathArray[0][0];
        }

        int val1 = minCostToReachEndofArray(row, col - 1);
        int val2 = minCostToReachEndofArray(row - 1,  col);
        int minCost = Integer.min(val1, val2);
        int currentCellCost =  pathArray[row][col];
        return  minCost + currentCellCost;
    }

    /**
     * Min. cost to reach end of an array
     *
     * DP-Top-Down approach
     *
     * */
    public int mctreoaTopDown(int[][] dp, int row, int col){

        int minVal = 0;
        int currentVal = 0;

        if (row == -1 || col == -1){
            return Integer.MAX_VALUE;
        }

        if(row == 0 || col == 0){
            dp[0][0] = pathArray[row][col];
        }
        if(dp[row][col] == 0){
            int val1 = mctreoaTopDown( dp, row - 1, col);
            int val2 = mctreoaTopDown( dp, row ,col - 1);
            minVal =  Integer.min(val1, val2);
            currentVal = pathArray[row][col];
            dp[row][col] = minVal + currentVal;
        }
       return dp[row][col];
    }
}
