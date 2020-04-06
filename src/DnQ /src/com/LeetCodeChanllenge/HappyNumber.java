package com.LeetCodeChanllenge;

import java.util.HashMap;

public class HappyNumber {

    HashMap<Integer, Integer> hM = new HashMap<>();

    public boolean isHappy(int n) {

        if(hM.get(n) != null){
            return false;
        }

        hM.put(n, n);

        int temp1;
        int temp2 = 0;


        if(n == 1){
            return true;
        }

        while(n > 0){
            temp1 = n % 10;
            temp2 +=  temp1*temp1;
            n = n/10;
        }
        n = temp2;
        return isHappy(n);

    }
}