package com.LeetCodeChanllenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Group Anagram
 *
 * Concept for string
 *
 * and
 *
 * HashMap.
 *
 * */
public class GroupsAnagram {

    public List<List<String>> groupAnagram(String[] strs){
        List<List<String>> groupAnagram = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String current: strs){
            char[] character = current.toCharArray();
            Arrays.sort(character);
            String sorted = new String(character);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        groupAnagram.addAll(map.values());
        return groupAnagram;

    }


}
