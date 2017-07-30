package CommonTechniques;

public class ProductExceptSelf {
	
	int productExceptSelf(int[] nums, int m) {
		 // 1,2,3,4    - 1, 2,6,24   ---24 12 8 6  
		   int sum = 0;
		   int product = 1;
		   for (int i = 0; i < nums.length; i++) {
		        sum = nums[i] * sum + product;
		        sum %= m;
		        product *= nums[i];
		        product %= m;
		    }
		    return sum;
	}
}
