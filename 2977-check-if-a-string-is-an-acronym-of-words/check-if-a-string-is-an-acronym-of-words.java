class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        int k=0;
        for(int i=0;i<words.size();i++){
          String x=words.get(i);
         if(x.charAt(0)!=s.charAt(k++)){
            return false;
          }
        }return true;
        
    }
}