package CommonTechniques;

public class ArrayMaxConsecutiveSum2 {
	int arrayMaxConsecutiveSum2(int[] inputArray) {
	    if(inputArray.length==0) return 0;
	    int[] sum = new int[inputArray.length];
	    sum[0]=inputArray[0];
	    int max =Integer.MIN_VALUE;
	    for(int i=1; i< inputArray.length; i++){
	        sum[i] =Math.max(sum[i-1]+inputArray[i],inputArray[i]);
	        max = Math.max(sum[i],max);
	    }
	    return max;
	}
}
