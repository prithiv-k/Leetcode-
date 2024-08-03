class Solution {
    public int similarPairs(String[] words) {
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String x=words[i];
            Set<Character> st=new HashSet<>();
            for(char h:x.toCharArray()){
                st.add(h);
            }
           String ans="";
           for(char t:st){
            ans+=t;
           }
           li.add(ans);
        }int sum=0;
        for(int i=0;i<li.size();i++){
            for(int j=i+1;j<li.size();j++){
                if(li.get(i).equals(li.get(j))){
                    sum++;
                }
            }
        }return sum;
    }
}