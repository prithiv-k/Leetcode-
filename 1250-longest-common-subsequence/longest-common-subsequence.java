class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
      return  ip(text1,text2,text1.length(),text2.length(),dp);
    }
    static int ip(String s1,String s2,int n,int m,int dp[][]){
        if(m==0||n==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            dp[n][m]=1+ip(s1,s2,n-1,m-1,dp);
            return dp[n][m];
        }else{
            int a=ip(s1,s2,n-1,m,dp);
            int b=ip(s1,s2,n,m-1,dp);
            dp[n][m]= Math.max(a,b);
            return dp[n][m];
        }
    }
}