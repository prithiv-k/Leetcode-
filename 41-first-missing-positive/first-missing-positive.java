class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                li.add(nums[i]);
            }
        }
        int k=1;
        while(li.contains(k)){
            k++;
        }
        return k;
    }
}