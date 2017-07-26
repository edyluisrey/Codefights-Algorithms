package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class ComposeRanges {
	String[] composeRanges(int[] nums) {
		  List<List<String>> list= new ArrayList<>();
		  if(nums.length==0) return new String[0];
		  List<String> sub = new ArrayList<>();
		  sub.add(""+nums[0]);  
		  for(int i =1; i< nums.length; i++){
		    if(nums[i]-nums[i-1]==1){
		      sub.add(""+nums[i]);
		    }else{
		       System.out.println(sub.toString());
		       list.add(sub);      
		       sub = new ArrayList<>();
		       sub.add(""+nums[i]); 
		    }
		  }
		  if(sub.size()>0)  list.add(sub); 
		 

		  System.out.println(list.toString());
		  String[] res = new String[list.size()];
		  for(int i=0 ; i< list.size(); i++){
		     List<String> sub1 = list.get(i);
		     if(sub1.size()==1){
		       res[i]= sub1.get(0);
		     }else{
		       res[i]= sub1.get(0)+"->"+ sub1.get(sub1.size()-1);
		     }
		  }
		      
		  return res;  
		}

}
