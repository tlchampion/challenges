package net.thomaschampion.leetcode.arithmetictriplet;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplet {

    public static void main(String[] args){
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;

        System.out.println(arithmeticTriplets(nums, diff));


    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        Set<Integer> seen = new HashSet<>();

        seen.add(nums[0]);
        seen.add(nums[1]);

        for (int i=2; i < nums.length; i++) {
            if (seen.contains(nums[i] - diff) && seen.contains(nums[i] - 2*diff)) {
                count++;
                seen.add(nums[i]);
            } else {
                seen.add(nums[i]);
            }
        }


        return count;
    }

}
