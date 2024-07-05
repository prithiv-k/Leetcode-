class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        HashSet<Integer> s3=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            s2.add(nums2[i]);
        }
        for(int i=0;i<nums3.length;i++){
            s3.add(nums3[i]);
        }
        List<Integer> h1=new ArrayList<>();
        List<Integer> h2=new ArrayList<>();
        List<Integer> h3=new ArrayList<>();
        for(int i:s1){
            h1.add(i);
        }
        for(int i:s2){
            h2.add(i);
        }
        for(int i:s3){
            h3.add(i);
        }

        HashMap<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<h1.size();i++){
        if(m.containsKey(h1.get(i))){
            m.put(h1.get(i),m.get(h1.get(i))+1);
        }else{
            m.put(h1.get(i),1);
        }
       }for(int i=0;i<h2.size();i++){
        if(m.containsKey(h2.get(i))){
            m.put(h2.get(i),m.get(h2.get(i))+1);
        }else{
            m.put(h2.get(i),1);
        }
       }for(int i=0;i<h3.size();i++){
        if(m.containsKey(h3.get(i))){
            m.put(h3.get(i),m.get(h3.get(i))+1);
        }else{
            m.put(h3.get(i),1);
        }
       }List<Integer> li=new ArrayList<>();
       for(Map.Entry<Integer,Integer> g:m.entrySet())
       {
         if(g.getValue()>=2)
         {
            li.add(g.getKey());
         }
       }
       return li;

    }
}