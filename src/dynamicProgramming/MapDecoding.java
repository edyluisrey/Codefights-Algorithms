package dynamicProgramming;

public class MapDecoding {
	int mapDecoding(String message) {
	    if(message==null) return 0;
	    if(message.length()==0) return 1;
	    int n= message.length();
	    int[] dp = new int[n+1];
	    dp[0] = 1;
	    dp[1]= message.charAt(0)=='0'?0:1;
	    int mod = 1000000007;
	    for(int i=2; i<=n; i++){
	        int sub1 = Integer.parseInt(message.substring(i-1,i));
	        int sub2 = Integer.parseInt(message.substring(i-2,i));
	        if(sub1!=0) dp[i]+= dp[i-1]%mod;
	        if(sub2>9 && sub2<27) dp[i]= dp[i]+dp[i-2]%mod;
	    }
	    return dp[n];
	}
}
