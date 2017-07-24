package arrays;

public class RotateImage {
	int[][] rotateImage(int[][] a) {
	    int temp=0;
	    int n= a.length;
	    for(int i = 0; i<n; i++){
	        for(int j = i; j<a[0].length; j++){
	            temp = 0;
	            temp = a[i][j];
	            a[i][j] = a[j][i];
	            a[j][i] = temp;
	        }
	    }
	    for(int i =0 ; i<n; i++){
	        for(int j = 0; j<n/2; j++){
	            temp = 0;
	            temp = a[i][j];
	            a[i][j] = a[i][n-1-j];
	            a[i][n-1-j] = temp;
	        }
	    }
	    
	    return a;
	}

}
