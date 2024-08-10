class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            prod*=nums[i];
            else{
                z++;
            }
            
        }
        if(z>1){
            return new int[nums.length];
        }else if(z==1){
          
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=prod;
                }else{
                    nums[i]=0;
                }
            }return nums;
        }else{
        for(int i=0;i<nums.length;i++){
            nums[i]=prod/nums[i];
        }return nums;
        }
    }
}  
