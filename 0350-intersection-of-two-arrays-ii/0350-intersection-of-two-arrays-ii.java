class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>li=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length&&j< nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]==nums2[j]){
                li.add(nums1[i]);
                i++;j++;
            }
    
    }int[] ans=new int[li.size()];
    for(int k=0;k<li.size();k++){
        ans[k]=li.get(k);
    }return ans;
    }

}