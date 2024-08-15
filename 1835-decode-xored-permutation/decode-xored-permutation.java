/*class Solution {
    public int[] decode(int[] e) {
        int n=e.length+1;
        int ans[]=new int[n];
        for(int i=1;i<=n;i++){
            ans[0]^=i;
        }for(int i=1;i<e.length;i++){
            ans[0]^=e[i];

        }for(int i=0;i<e.length;i+=2){
            ans[i+1]=e[i]^ans[i];
            
        }return ans;
    }
}
*/class Solution {
    public int[] decode(int[] e) {
        int n=e.length+1;
        int[] res=new int[n];
        for(int i=1;i<=n;i++){
            res[0]^=i;
        }
        for(int i=1;i<n-1;i+=2){
            res[0]^=e[i];
        }
        for(int i=0;i<n-1;i++){
            res[i+1]=e[i]^res[i];
        }
        return res;
    }
}