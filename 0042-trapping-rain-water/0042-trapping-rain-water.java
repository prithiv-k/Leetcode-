class Solution {
  public int trap(int[] height) {
    int ans=0;
    int l=0;
    int r=height.length-1;
    int ml=height[l];
    int mr=height[r];
 while(l<r)
      if(ml<mr){
        ans+=ml-height[l];
        ml=Math.max(ml,height[++l]);
      } 
      else{
        ans+=mr-height[r];
        mr=Math.max(mr,height[--r]);
      }
      return ans;
  }
}