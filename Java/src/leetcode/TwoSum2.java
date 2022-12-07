package leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum2 {
	
	public static void main(String[] args) {
		
		int[] myArray = {2,7,8,11,13,15};
		
				
		
		int[] result = twoSum2(myArray, 19);

		for (int element : result) {
			System.out.println(element);
		}
	 
		
		
		
	}
	
	public static int[] twoSum2(int[] nums, int target) {
		
		int beg = 0;
		int end = nums.length - 1;
		while (beg < end) {
			if (nums[beg] + nums[end] == target) {
				return new int[] {beg+1, end+1};
			} else if (nums[beg] + nums[end] > target) {
				end -= 1;
			} else if (nums[beg] + nums[end] < target) {
				beg += 1;
			}
		
		
		}
		
		return null;
			
		
		
	}

}
