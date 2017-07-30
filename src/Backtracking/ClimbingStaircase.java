package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStaircase {
	 
	 int[][] climbingStaircase(int n, int k) {
		   List<List<Integer>> result = new ArrayList<>();
		   backtrack(n , k, result, new ArrayList<Integer>());
		   int[][] re = new int[result.size()][0];
		   for(int i =0; i< result.size(); i++){
		      re[i] = new int[result.get(i).size()];
		      for(int j=0; j< result.get(i).size(); j++){
		         re[i][j] = result.get(i).get(j);
		      }
		   }
		   return re;
		}

		void backtrack(int n, int k, List<List<Integer>> result, List<Integer> tempList){
		   if(n==0){
		      result.add(new ArrayList<>(tempList)); 
		   }
		   
		   for(int i=1; i<=k; i++){
		        if(n>=i){
		           tempList.add(i);
		           backtrack(n-i, k, result, tempList);
		           tempList.remove(tempList.size()-1);
		        }
		   }
		}

		 
}
