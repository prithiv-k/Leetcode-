class Solution {
    public int findMaxK(int[] nums) {
       List<Integer> li=new ArrayList<>();
       for(int i:nums){
        li.add(i);
       }Arrays.sort(nums);
       for(int i=nums.length-1;i>=0;i--){
        int x=nums[i];
        if(li.contains(x)&&li.contains(x*-1)){
            return x;
        }
       }return -1;
    }
}