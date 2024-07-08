class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
       HashSet<Double> li = new HashSet<>();
        while(l<r){
            double sum=(nums[l]+nums[r])/2.0;
            li.add(sum);
            l++;
            r--;
        }return li.size();
        
        
    }
}