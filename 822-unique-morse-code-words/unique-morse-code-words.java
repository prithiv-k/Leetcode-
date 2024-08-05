class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String []s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> hm=new HashMap<>();
        List<String> ans=new ArrayList<>();
        char c='a';
        for(int i=0;i<s.length;i++){
            hm.put(c++,s[i]);
        }for(int i=0;i<words.length;i++){
            String fin="";
            String x=words[i];
            for(int j=0;j<x.length();j++){
                fin+=hm.get(x.charAt(j));
            }if(!ans.contains(fin)){
                ans.add(fin);
            }
        }return ans.size();
    }
}