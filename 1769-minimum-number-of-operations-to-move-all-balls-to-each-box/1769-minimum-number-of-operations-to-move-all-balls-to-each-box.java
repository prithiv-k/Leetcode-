class Solution {
    public int[] minOperations(String b) {
        List<Integer>li=new ArrayList<>();
        int ans[]=new int[b.length()];
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                li.add(i);
            }
        }
        for(int i=0;i<b.length();i++){
            int sum=0;
            for(int j=0;j<li.size();j++){
            
                sum+=Math.abs(i-li.get(j));
             
            }
            ans[i]=sum;
        }return ans;
    }
}