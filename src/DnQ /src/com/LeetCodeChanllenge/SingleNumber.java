package com.LeetCodeChanllenge;

import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int uniqueValue = 0;

        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0; i< nums.length; i ++){
            if(map.get(nums[i]) == null){
                map.put(nums[i], nums[i]);
            } else {
                map.remove(nums[i]);
            }
        }

        for(int i=0; i<nums.length; i ++){
            if(map.get(nums[i]) != null){
                uniqueValue = map.get(nums[i]);
            }
        }


        return uniqueValue;

    }
}
