class Solution {
    public String firstPalindrome(String[] words) {
        String fin="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            String ans="";
            for(int j=s.length()-1;j>=0;j--){
                ans+=s.charAt(j);
            }
            if(ans.equals(s)){
                fin=s;
                break;
            }
        }return fin;
        
    }
}