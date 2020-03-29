package com.rajat.problems;

import com.rajat_coding.Main;

public class HouseTheif {

    public int houseTheif(int index, int[] houseArray){


        if(index > houseArray.length - 1){
            return 0;
        }


        int currentHouse = houseArray[index] + houseTheif(index + 2, houseArray);
        int skipCurrentHouse =  houseTheif(index + 1, houseArray);
        return Math.max(currentHouse, skipCurrentHouse);
    }


    public int houseTheifDnP(int index, int[] houseArray) {

        if(index > houseArray.length - 1){
            return 0;
        }

        int[] arr = new int[houseArray.length];

        if(arr[index] == 0){
            int currentHouse = houseArray[index] + houseTheifDnP(index + 2, houseArray);
            int skipCurrentHouse =  houseTheifDnP(index + 1, houseArray);
            arr[index] = Math.max(currentHouse, skipCurrentHouse);
        }
        return arr[index];
    }




}
