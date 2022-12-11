package net.thomaschampion.leetcode.longestMountain;

public class LongestMountain {

    public static void main(String[] args){
        int [] arr = {1,1,2,3,4,5,4,3,2,1,1};

        System.out.println(longestMountain(arr));
    }
// initial Longest Mountain attempt.
    public static int longestMountain(int[] arr) {
        int count;
        int max = 0;

        for (int point = 1; point <= arr.length - 2; point++){
            count = 0;
            if ((arr[point - 1] < arr[point]) && (arr[point] > arr[point + 1])) {
                count++;


                int diff = 0;

                while ((point - diff - 1 >= 0) && (arr[point -1 - diff] < arr[point - diff])){

                    count++;
                    diff++;
              }

                diff = 0;
                int index = point;
                while ((index + diff + 1 < arr.length) && (arr[index + diff] > arr[index + diff + 1])){

                    count++;
                    diff++;
                    point++;

                }

            }
            if (max < count) {
                max = count;
            }
        }



        return max;
    }


}
