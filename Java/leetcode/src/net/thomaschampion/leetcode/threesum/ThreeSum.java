package net.thomaschampion.leetcode.threesum;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};




        quickSort(nums, 0, nums.length - 1);

        List<List<Integer>> solution = new ArrayList<>();

        solution = threeSum(nums);
        System.out.println(solution);




    }



    public static List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList<List>();

        quickSort(nums, 0, nums.length - 1);

        int pos = 0;
        Set<Integer> seen = new HashSet<Integer>();

        while (pos < nums.length - 2) {


            //what number are we checking

            if (!seen.contains(nums[pos])) {


            int num1 = nums[pos];
            int target = -1 * num1;

            Set<Integer> answers = new HashSet<>();
            answers = twoSum(nums, pos + 1, target);

            if (answers != null) {
                for(int num: answers) {
                    List<Integer> triplet = Arrays.asList(nums[pos], num, -nums[pos] - num);
                    result.add(triplet);

                }
            }






        }
            seen.add(nums[pos]);
            pos++;
            System.out.println(seen);
        }


        return result;

    }

// implementation of 2Sum problem in order to find pair of integers in substring that meets target value

    public static Set<Integer> twoSum(int[] nums, int start, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> answer = new HashSet<>();

        for (int i = start; i < nums.length; i++) {
            int need = target - nums[i];


            if (map.containsKey(need)) {

                answer.add(nums[i]);

            }
            map.put(nums[i],i);


        }


        return answer;
    }


// Quicksort implementation
    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }


    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }





}
