class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,String>hm=new HashMap<>();
        for(int i=0;i<n;i++){
        hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=0;
        int fin[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            fin[j]=heights[i];
            j++;
        }
        String[] ans=new String[names.length];
        for(int i=0;i<heights.length;i++){
            ans[i]=hm.get(fin[i]);

        }return ans;
    }
}