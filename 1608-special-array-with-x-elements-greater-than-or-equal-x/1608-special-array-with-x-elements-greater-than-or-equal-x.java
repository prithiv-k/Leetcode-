class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int []count=new int[n+1]; 
        for (int num:nums) {
            if (num<n) {
                count[num]++;
            } else {
                count[n]++;
            }
        }System.out.println(count);
         for (int i = n;i>=0;i--) {
            if (count[i]==i) {
                return i;
            }
            if (i>0){
                count[i-1]+=count[i];
            }
        }
        return -1; 
        
    }
}