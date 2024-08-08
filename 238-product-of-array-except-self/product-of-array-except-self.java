class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            prod*=nums[i];
            else{
                z++;
            }
            
        }if(z>1){
            return new int[nums.length];
        }else if(z==1){
            int arr[]=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    arr[i]=prod;
                }
            }return arr;
        }else{
        for(int i=0;i<nums.length;i++){
            nums[i]=prod/nums[i];
        }return nums;
        }
    }
}  
