class Solution {
    public void rotate(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=t;
            }
    }
        return ;
    }
}