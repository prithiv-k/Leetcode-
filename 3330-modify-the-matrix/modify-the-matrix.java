class Solution {
    public int[][] modifiedMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==-1){
                    int max=Integer.MIN_VALUE;
                    for(int k=0;k<m;k++){
                        if(max<mat[k][j]){
                            max=mat[k][j];
                        }
                    }mat[i][j]=max;
                }
                
            }
        }return mat;
    }
}