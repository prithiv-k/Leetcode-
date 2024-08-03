class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                max+=1;
            }else{
                li.add(max);
                max=1;
            }
        }li.add(max);
        max=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                max+=1;
            }else{
                li.add(max);
                max=1;
            }
        }li.add(max);
        Collections.sort(li);
        return li.get(li.size()-1);
        
    }
}