package com.rajat_coding;

import com.rajat.problems.HouseTheif;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {6, 7, 1, 30, 8, 2, 4};
        int[] b = {20, 5, 1, 13, 6, 11, 40};
        HouseTheif x = new HouseTheif();
        System.out.println(x.houseTheif(0, a));
        System.out.println(x.houseTheif(0, b));

        System.out.println(x.houseTheifDnP(0, a));

    }
}
