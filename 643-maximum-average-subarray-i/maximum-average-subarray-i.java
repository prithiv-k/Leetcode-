class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int val=max;
        for(int i=k;i<n;i++){
            val+=nums[i]-nums[i-k];
            max=Math.max(val,max);
        }
        return max/(double)k;
    }
}