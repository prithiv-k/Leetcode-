class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=encrypt(nums[i]);
        }
        return sum;
    }
    static int encrypt(int n){
        if(n<10){
            return n;
        }else{
            List<Integer> li=new ArrayList<>();
            while(n>0){
                int r=n%10;
                li.add(r);
                n/=10;
            }Collections.sort(li);
            int max=li.get(li.size()-1);
            String s=String.valueOf(max);
            String ans="";
            for(int i=0;i<li.size();i++){
                ans+=s;
            }
            return Integer.parseInt(ans);
        }
    }
}