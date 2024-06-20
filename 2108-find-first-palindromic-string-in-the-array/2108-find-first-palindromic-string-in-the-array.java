class Solution {
    public String firstPalindrome(String[] words) {
        for(String fin:words){
            if(isPalindrome(fin)){
                return fin;
            }
            }
        return "";
    }
    public static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}