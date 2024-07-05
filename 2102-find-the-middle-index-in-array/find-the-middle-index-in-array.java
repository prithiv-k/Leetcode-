class Solution {
    public int findMiddleIndex(int[] nums) {
        int l=0;
        int r=nums.length-1;
        for (int mid=0;mid<nums.length;mid++) {
            int sum1=0;
            int sum2=0;
            for(int i=0;i<mid;i++){
                sum1+=nums[i];
            }
            for(int j=mid+1;j<nums.length;j++) {
                sum2+=nums[j];
            }
            if(sum1==sum2) {
                return mid;
            }
        }

        return -1; 
    }
}
