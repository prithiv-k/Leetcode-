class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                if(ip(s,l+1,r)) return true;
                if (ip(s,l,r-1))  return true;
                else return false;
            }
        }return true;
        
    }
    static boolean ip(String l,int i,int j){
        while(i<j){
        if(l.charAt(i)!=l.charAt(j)) {
            return false;
        }else{
                i++;
                j--;
        }
       
        }
         return true;
    }
}