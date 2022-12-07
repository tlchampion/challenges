package leetcode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {


	    HashMap<Integer, Integer> map;

		public TwoSum() {
	    	this.map = new HashMap<Integer, Integer>();
	        
	    }
	    
	    public void add(int number) {
	    	Integer count = map.containsKey(number) ? map.get(number) : 0;
	    	this.map.put(number,  count+1);
	    		
	    		
	        
	    }
	    
	    public boolean find(int value) {
	    	for (Map.Entry<Integer, Integer> entry: this.map.entrySet()) {
	    		int need = value - entry.getKey();
	    		if (need != entry.getKey()) {
	    			if(this.map.containsKey(need)) {
	    				return true;
	    			}
	    		} else {
	    			if (entry.getValue() > 1) {
	    				return true;
	    			}
	    		}
	    	
	    	} return false;
	}
}

public class TwoSum3{
	
public static void main(String[] args) {
		
		int[] myArray = {2,7,8,11,13,15};
		
				
		
		// int[] result = twoSum2(myArray, 19);

		TwoSum obj = new TwoSum();
		obj.add(5);
		System.out.println(obj.map);
		obj.add(4);
		obj.add(5);
		System.out.println(obj.map);
		System.out.println(obj.find(9));
		System.out.println(obj.find(8));
		System.out.println(obj.find(10));
		System.out.println(obj.map.get(5));
	
}}
	/**
	 * Your TwoSum object will be instantiated and called as such:
	 * TwoSum obj = new TwoSum();
	 * obj.add(number);
	 * boolean param_2 = obj.find(value);
	 */

