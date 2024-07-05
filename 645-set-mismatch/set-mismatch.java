class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int num=0;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!li.contains(nums[i])){
                li.add(nums[i]);
            }else{
                num=nums[i];
            }
        }int n=nums.length;
        int sum=0;
        for(int i=0;i<li.size();i++){
            sum+=li.get(i);
        }int tot=(n*(n+1))/2;
        int mis=tot-sum;
        return new int[]{num,mis};
    }
}