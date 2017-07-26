package dynamicProgramming;

public class HouseRobber {
	int houseRobber(int[] nums) {
	     if(nums.length==0) return 0;
	     if(nums.length==1) return nums[0];
	     int[] max = new int[nums.length];
	     max[0]= nums[0];
	     max[1]= Math.max(nums[0], nums[1]);
	     for(int i =2; i < nums.length; i++){
	          max[i]= Math.max(max[i-2]+nums[i],max[i-1]);
	     }
	     return max[nums.length-1];
	}
}
