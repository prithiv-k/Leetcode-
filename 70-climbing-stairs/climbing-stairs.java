class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fib(n,dp);
    }
    static int fib(int n,int dp[]){
        if(n==1||n==2||n==3){
            return n;
        }if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n]= fib(n-1,dp)+fib(n-2,dp);
            return dp[n];
        }
    }
}