package hashTables;

import java.util.HashMap;

public class ContainsCloseNums {
	boolean containsCloseNums(int[] nums, int k) {
		  HashMap<Integer, Integer> map = new HashMap<>();
		  for(int i =0; i< nums.length; i++){
		     if(map.containsKey(nums[i])){
		         if((i-map.get(nums[i]))<=k) return true;
		         else map.put(nums[i],i); 
		     }else{
		       map.put(nums[i],i);
		     }
		  }
		  return false;
	}
}
