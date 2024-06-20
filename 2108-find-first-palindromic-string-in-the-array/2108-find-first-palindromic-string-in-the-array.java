class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)){
                return word;
            }
            }
        return "";
    }
    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}