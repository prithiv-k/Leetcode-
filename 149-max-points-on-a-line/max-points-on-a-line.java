class Solution {
    public int maxPoints(int[][] p) {
        int n=p.length;
        int max=0;
        if(n<=2) return n;
        else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int x1=p[i][0],y1=p[i][1];
                    int x2=p[j][0],y2=p[j][1];
                    int a=y1-y2;
                    int b=x2-x1;
                    int c=-(a*x1+b*y1);
                    int count=counts(a,b,c,p);
                    max=Math.max(max,count);
                }
            }return max;
        }
    }
    static int counts(int a,int b,int c,int[][]p){
        int ct=0;
        for(int []i:p){
            int x=i[0],y=i[1];
            if(a*x+b*y+c==0)  ct++;
        }return ct;
    }
}