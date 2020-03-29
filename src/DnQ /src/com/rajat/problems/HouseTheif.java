package com.rajat.problems;

import com.rajat_coding.Main;

public class HouseTheif {

    public int houseTheif(int index, int[] houseArray){

        int currentHouse = houseArray[index] + houseTheif(index + 2, houseArray);
        int skipCurrentHouse =  houseTheif(index + 1, houseArray);
        return Math.max(currentHouse, skipCurrentHouse);
    }


}
