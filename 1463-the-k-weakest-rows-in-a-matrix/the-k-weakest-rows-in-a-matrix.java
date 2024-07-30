class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n[]=new int[mat.length];
        int s[]=new int[mat.length];
        
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
            }s[i]=sum;
            n[i]=i;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length-i-1;j++){
                if(s[j]>s[j+1]){
                    int t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                    int p=n[j];
                    n[j]=n[j+1];
                    n[j+1]=p;
                }
            }
        }int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=n[i];
        }return ans;
    }
}