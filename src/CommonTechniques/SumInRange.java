package CommonTechniques;

import java.util.HashMap;

public class SumInRange {
	int sumInRange(int[] nums, int[][] queries) {
	     if(nums.length==0 || queries.length==0) return 0;
	     int mod= 1000000007;
	     HashMap<Integer,Integer> map = new HashMap<>();
	     int sumPre = nums[0];
	     map.put(0,sumPre);
	     for(int i= 1; i< nums.length;i++){
	          sumPre= sumPre+nums[i];
	          map.put(i,sumPre%mod);
	     }   
	     int sum=0;
	     for(int i = 0; i< queries.length;i++){
	         if(queries[i][0]==0) 
	              sum = sum%mod +  map.get(queries[i][1])%mod;
	         else 
	              sum = sum%mod + map.get(queries[i][1])- map.get(queries[i][0]-1)%mod;      
	     }
	     return (sum+ mod)%mod;
	}

}
