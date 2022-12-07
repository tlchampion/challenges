package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanSolution {
	
	
public static int romanToInt(String s) {
	Map<Character, Integer> map = new HashMap<Character,Integer>();
	
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C',  100);
	map.put('D',  500);
	map.put('M',  1000);

	
	char last = s.charAt(s.length() - 1);
	
	int sum = map.get(last);
	
	for(int i = s.length() - 2; i >=0; i--) {
		char current = s.charAt(i);
		
		if (map.get(current) >= map.get(last)) {
			System.out.println("current: " + current + ";last: " + last + ";index: " + i);
			sum += map.get(current);
			System.out.println(sum);
			
		} else {
			System.out.println("current: " + current + ";last: " + last + ";index: " + i);
			sum -= map.get(current);
			System.out.println(sum);
		}
		last = current;
	}
	
	
	return sum;

	}
	 
	public static void main(String[] args) {
		
		int result = romanToInt("III");
		System.out.println(result);
		
	}
	
	
	

}
