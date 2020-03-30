package com.rajat_coding;

import com.rajat.problems.ConvertOneStringToAnother;
import com.rajat.problems.HouseTheif;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {6, 7, 1, 30, 8, 2, 4};
        int[] b = {20, 5, 1, 13, 6, 11, 40};
        HouseTheif x = new HouseTheif();



        System.out.println(x.houseTheif(0, a));


        System.out.println(x.houseTheif(0, b));


        long startTime = System.nanoTime();
//        System.out.println(x.houseTheifDnP(0, a));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

//        System.out.println("Execution time in nanoseconds  : " + timeElapsed);
//
//        System.out.println("Execution time in milliseconds : " +
//                timeElapsed / 1000000);


        /**
         * Convert one String to Another
         *
         * */
        ConvertOneStringToAnother convertOneStringToAnother= new ConvertOneStringToAnother();
//       int resultConvertOneStringToAnother = convertOneStringToAnother.convertOneStringToAnother("table", "tbres", 0, 0);

        System.out.println("resultConvertOneStringToAnother");
        System.out.println(convertOneStringToAnother.convertOneStringToAnother("table", "tbres", 0, 0));
        System.out.println(convertOneStringToAnother.convertOneStringToAnotherDnQTopDown("table", "tbres", 0, 0));


    }
}
