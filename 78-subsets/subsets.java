class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> g=new ArrayList<>();
        int n=nums.length;
        ip(li,g,nums,n,0);
        return li;
    }
    static void ip(List<List<Integer>>li,List<Integer> g,int []nums,int n,int i){
        if(n==i){
            li.add(new ArrayList<>(g));
        }else{
            g.add(nums[i]);
            ip(li,g,nums,n,i+1);
            g.remove(g.size()-1);
            ip(li,g,nums,n,i+1);

        }
    }
}