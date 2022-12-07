package leetcode;

import java.util.*;

public class PalindromeSolution {
	
	public static boolean isPalindrome(int x) {
		
		String input = String.valueOf(x);
		
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		StringBuilder input2 = new StringBuilder();
		input2.append(input);
		input1.reverse();
		if(input1.compareTo(input2) == 0) {
			return true;
		} else {
			return false;
		}
		
		

	}
	
	public static void main(String[] args) {
		
		int numbers = 12211;
		boolean result = isPalindrome(numbers);
		System.out.println(result);
		
	}
	

}




