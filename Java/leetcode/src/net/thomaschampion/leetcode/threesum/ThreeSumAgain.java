package net.thomaschampion.leetcode.threesum;

import java.util.*;

public class ThreeSumAgain {



    public static void main(String[] args) {
        int[] nums = {0,1,1};


        ArrayList<List<Integer>> solution = (ArrayList<List<Integer>>) threeSum(nums);
        System.out.println(solution);


    }



    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);


        for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                twoSumII(nums, i, result);
            }

        }
        return result;

    }

// implementation of 2Sum problem in order to find pair of integers in substring that meets target value

    public static void twoSumII(int[] nums, int i, List<List<Integer>> result) {
        int low = i+1, high = nums.length - 1;

        while (low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            if (sum < 0) {
                low++;
            } else if (sum > 0) {
                high--;
            } else {
                result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;

                while (low < high && nums[low] == nums[low - 1]){
                        low++;

                }
            }

        }


    }



}
