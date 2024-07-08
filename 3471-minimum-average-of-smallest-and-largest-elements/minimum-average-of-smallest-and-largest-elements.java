class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=nums.length-1;
        Arrays.sort(nums);
        double[] arr=new double[n/2];
        int i=0;
        while(l<r){
            double sum=(nums[l]+nums[r])/2.0;
                arr[i++]=sum;
                System.out.print(sum+" ");
                l++;
                r--;

        }Arrays.sort(arr);
       return arr[0];
        
    }
}