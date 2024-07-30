class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> li=new ArrayList<>();
        for(int i:arr){
            li.add(i);
        }
        List<Integer> ans=new ArrayList<>();
        int j=1;
        int i=0;
        while(i<k){
            if(li.contains(j)){
                j++;
            }else{
                ans.add(j);
                j++;
                i++;
            }
        }return ans.get(ans.size()-1);

    }
}