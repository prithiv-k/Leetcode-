class Solution {
    public int passThePillow(int n, int time) {
        int ind=1;
        int ans=0;
        boolean forw=true;
        while(ans<time){
           if(forw){
             if(ind<n){
                ind++;
             }else{
                forw=false;
                ind--;
             }
           }else{
            if(ind>1){
                ind--;
            }else{
                forw=true;
                ind++;
            }
           }
            ans++;
        }return ind;
}
}