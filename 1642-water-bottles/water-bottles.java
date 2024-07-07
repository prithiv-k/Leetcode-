class Solution {
    public int numWaterBottles(int nb, int ex) {
        int ans=nb;
        while(nb>0&&nb>=ex){
            int r=nb%ex;
            nb=nb/ex;
            ans+=nb;
            nb=nb+r;

        }return ans;
    }
}