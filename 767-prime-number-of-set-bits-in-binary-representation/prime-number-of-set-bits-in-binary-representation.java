class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            String x=Integer.toBinaryString(i);
            int sum=0;
            for(int j=0;j<x.length();j++){
                if(x.charAt(j)=='1'){
                    sum++;
                }
            }if(ip(sum)) ans++;
        }return ans;
        
    }
    static boolean ip(int n){
        if(n==1){
            return false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }return true;
        }
    }
}