class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }List<Integer> uni=new ArrayList<>();
        for(int i:nums){
            if(!uni.contains(i)){
                uni.add(i);
            }
        }int [] fre=new int[uni.size()];
        for(int i=0;i<uni.size();i++){
            int x=uni.get(i);
            fre[i]=hm.get(x);
        }for(int i=0;i<fre.length;i++){
            for(int j=0;j<fre.length-i-1;j++){
                if(fre[j]>fre[j+1]){
                    int t=fre[j];
                    fre[j]=fre[j+1];
                    fre[j+1]=t;
                   int p = uni.get(j);          
                   uni.set(j, uni.get(j + 1));    
                   uni.set(j + 1, p);  
                }
            }
        }int f=0;
        int l=uni.size()-1;
        int ans[]=new int[k];
        while(f<k){
            ans[f++]=uni.get(l--);
        }return ans;
    }
}
