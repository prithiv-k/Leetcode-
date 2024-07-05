class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                ans.add(i);
            }
        }return ans;
    }
}