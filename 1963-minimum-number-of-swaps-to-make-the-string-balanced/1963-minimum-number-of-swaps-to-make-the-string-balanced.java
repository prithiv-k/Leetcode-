class Solution {
    public int minSwaps(String s) {
        int cnt=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt==-1){
                ans++;
                cnt+=2;
            }
        }return ans;
    }
}