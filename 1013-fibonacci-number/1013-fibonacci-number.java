class Solution {
    public int sol(int n, int dp[]){
        if(n == 0 || n==1)
        return n;
        if(dp[n] != -1) return dp[n];
        else
        dp[n] = sol(n-1,dp) + sol(n-2,dp);
        return dp[n];

    }
    public int fib(int n) {
      int dp[] = new int[n+1];
      Arrays.fill(dp,-1);
       dp[0] = 0;  
       return sol(n,dp);

    }
}