class Solution {
    public int minOperations(int[] nums) {
        int flip=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if((flip%2==0&&nums[i]%2==0)||flip%2!=0&&nums[i]%2!=0){
                nums[i]=nums[i]^1;
                flip++;
            }
        }return flip;

        
    }
}