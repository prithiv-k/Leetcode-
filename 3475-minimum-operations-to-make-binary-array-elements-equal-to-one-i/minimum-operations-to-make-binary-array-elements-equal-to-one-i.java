class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
       for(int i=0;i<nums.length;i++){
        if(i==nums.length-2 && nums[i]==0||i==nums.length-1&&nums[i]==0){
            return -1;
        }
        if(nums[i]==0){
        nums[i]=nums[i]^1;
        nums[i+1]=nums[i+1]^1;
        nums[i+2]=nums[i+2]^1;
        ans++;
       } 
    }return ans;
}
}