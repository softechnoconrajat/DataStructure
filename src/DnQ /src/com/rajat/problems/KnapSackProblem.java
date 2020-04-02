package com.rajat.problems;

public class KnapSackProblem {

    public int knapSackProblem(int[] weight, int[] profit, int capacity, int currentIndex ){

        if( currentIndex >= profit.length || currentIndex < 0 || capacity <= 0 ) {
            return 0;
        }
        int profitAfterSelectingItem = 0;
        if(weight[currentIndex] <= capacity) {
             profitAfterSelectingItem = profit[currentIndex] + knapSackProblem(weight, profit, capacity - weight[currentIndex], currentIndex + 1);
        }
        int profitWithoutSelectingItem = knapSackProblem(weight, profit, capacity , currentIndex + 1);
        return Math.max(profitWithoutSelectingItem, profitAfterSelectingItem);
    }
}
