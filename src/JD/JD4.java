package JD;
/*
Author: 大排面加蛋
Date  : 2022/09/01 22:19
*/

public class JD4 {
    public int countWays(int n) {
        // write code here
        if (n==1){
            return 0;
        }
        int[] dp =new int[n+1];
        dp[1]=1;
        dp[2]=1;
        for (int i=3;i<=n;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
