class Solution {
    public int minOperations(int[] nums) {
        int flip=0;
        for(int i=0;i<nums.length;i++){
            if((flip%2==0&&nums[i]%2==0)||flip%2!=0&&nums[i]%2!=0){
                nums[i]=nums[i]^1;
                flip++;
            }
        }return flip;

        
    }
}