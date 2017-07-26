package dynamicProgramming;

public class ClimbingStairs {
	int climbingStairs(int n) {
	    if(n<=2) return n;
	    int[] num = new int[n];
	    num[0]=1;
	    num[1]=2;
	    for(int i =2; i< n; i++){
	        num[i]=num[i-1]+ num[i-2];
	    }
	    return num[n-1];
	}
}
