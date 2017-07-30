package CommonTechniques;

import java.util.HashMap;

public class FindLongestSubarrayBySum {
	int[] findLongestSubarrayBySum(int s, int[] arr) {
	    HashMap<Integer,Integer> map = new HashMap<>();
	    int max =0; int sum=0;
	    int[] re = new int[2];
	    for(int i=0; i< arr.length; i++){
	        sum+=arr[i];
	        if(sum==s){
	            max=i+1;
	            re[0]=1;
	            re[1]=i+1;
	        }
	        if(map.containsKey(sum-s)){
	            if(max< i-map.get(sum-s)){
	                max= i-map.get(sum-s);
	                re[0]= map.get(sum-s)+2;
	                re[1]=i+1;
	            }
	        }
	        map.put(sum,i);
	    }
	    System.out.println("max:"+max);
	    if(max==0) return new int[]{-1};
	    else return re;
	    
	}
}
