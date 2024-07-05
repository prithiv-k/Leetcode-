class Solution {
    public int pivotIndex(int[] nums) {
       
        for(int mid=0;mid<nums.length;mid++){
             int sum1=0;
        int sum2=0;
            for(int i=0;i<mid;i++){
                sum1+=nums[i];
            }for(int i=mid+1;i<nums.length;i++){
                sum2+=nums[i];
            }
            if(sum1==sum2){
                return mid;
            }
        }return -1;
    }
}