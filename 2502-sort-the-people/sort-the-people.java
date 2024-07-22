class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,String>hm=new HashMap<>();
        for(int i=0;i<n;i++){
        hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=0;
        String[] ans=new String[names.length];
        for(int i=heights.length-1;i>=0;i--){
            ans[j]=hm.get(heights[i]);
            j++;
        }return ans;
        
        
    }
}