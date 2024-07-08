class Solution {
    public int maxIceCream(int[] nums, int coins) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        int sum=0;
        if(nums[0]>coins){
            return 0;
        }
        else{
            for(int i=0;i<n;i++){
                sum+=nums[i];
                if(sum>coins){
                    break;
                }else{
                    ans++;
                }
            }
        }return ans;
        
    }
}