class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> h=new HashSet<>();
        for(int i:nums){
            if(i>0){
                h.add(i);
            }
        }
      
      int j=1;
       while(h.contains(j)){
        j++;
      }return j;
    }
}