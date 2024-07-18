class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-1-j]=t;
            }
        }
    }
}