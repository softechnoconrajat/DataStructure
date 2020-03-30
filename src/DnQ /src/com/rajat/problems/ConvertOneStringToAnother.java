package com.rajat.problems;

public class ConvertOneStringToAnother {


    /**
     * Noramal Divide and Conqure solution
     *
     * */
    public int convertOneStringToAnother(String s1, String s2, int i1 , int i2){

        //If s1 size is bigger
        if(s2.length() <= i2){
            return  s1.length() - i1;
        }

        //if s1 size is smaller
        if(s1.length() == i1){
            return s2.length() - i2;
        }


         if(s1.charAt(i1) == s2.charAt(i2)){
             return convertOneStringToAnother(s1, s2, i1+1, i2+1);
         }

         //Deleting
        int t1 = 1 + convertOneStringToAnother(s1, s2, i1, i2+1);

         //Inserting
        int t2 = 1 + convertOneStringToAnother(s1, s2, i1+1, i2);

        //updating
        int t3 = 1 + convertOneStringToAnother(s1, s2, i1+1, i2+1);

        return Math.min(t1, Math.min(t2, t3));

    }

    /**
     *Dynamic Programming Top-Down Approach
     *
     * */
    public int convertOneStringToAnotherDnQTopDown(String s1, String s2, int i1 , int i2) {
        int[][] storage = new int[s1.length()][s2.length()];

        if(storage[i1][i2] == 0){

            if(s1.length() == i1){
                storage[i1][i2] = s2.length() - i2;
            }

            if(s2.length() == i2){
                storage[i1][i2] = s1.length() - i1;
            }

            if(s1.charAt(i1) == s2.charAt(i2)){
                storage[i1][i2] = convertOneStringToAnother(s1, s2, i1+1, i2+1);
            }

            //Delete
            int x1 = convertOneStringToAnother(s1, s2, i1, i2+1);

            //Update
            int x2 = convertOneStringToAnother(s1, s2, i1+1, i2+1);

            //Insert
            int x3 = convertOneStringToAnother(s1, s2, i1+1, i2);

            storage[i1][i2] = Math.min(x1, Math.min(x2, x3));
        }
        return storage[i1][i2];
    }
    }
