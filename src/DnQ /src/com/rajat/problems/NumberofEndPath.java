package com.rajat.problems;


/**
 * To find number of  path to the end of the array
 * */
public class NumberofEndPath {

    int[][] inputArray ={{4, 7, 1, 6}, {5, 7, 3, 9}, {3, 2, 1, 2}, {7, 1, 6, 3}};


    /**
     *
     * Divide & conquer approach
     * */
    public int numberOfPathToTheEnd(int cost, int row, int col){


        if(row == 0 && col == 0){
            return (inputArray[0][0] - cost == 0) ? 1: 0;
        }

        if(cost < 0){
            return 0;
        }

        if(row == 0){
            return  numberOfPathToTheEnd(cost - inputArray[row][col], 0, col - 1);
        }

        if(col == 0){
            return  numberOfPathToTheEnd(cost - inputArray[row][col], row - 1, 0);
        }
        if(row > inputArray.length - 1 || col > inputArray[0].length -1){
            return 0;
        }
        int path1  = numberOfPathToTheEnd(cost - inputArray[row][col], row - 1, col);
        int path2  = numberOfPathToTheEnd(cost - inputArray[row][col], row , col - 1);
        int maxPath =  path1 + path2;
        return  maxPath;
    }


    /**
     *
     * dp-Top-down-Approach
     *
     */
    public int dpTopDown(int[][] dp, int cost, int row, int col){



        if(row == 0 && col == 0 ){ dp[0][0] = (inputArray[0][0] == cost) ? 1 : 0; }

        if(cost < 0){ return 0; }

        if(row > inputArray.length - 1 || col > inputArray[0].length -1){
            return 0;
        }

        if(dp[row][col] == 0){

            if(row == 0){
                dp[row][col] =   dpTopDown(dp, cost - inputArray[row][col], 0, col - 1);
            }

           else if(col == 0){
                dp[row][col] =   dpTopDown(dp, cost - inputArray[row][col], row - 1, 0);
            }
           else {
                int path1  = dpTopDown(dp, cost - inputArray[row][col], row - 1, col);
                int path2  = dpTopDown(dp, cost - inputArray[row][col], row , col - 1);
                int maxPath =  path1 + path2;
                dp[row][col] = maxPath;
            }
        }

        return dp[row][col];
    }

}


