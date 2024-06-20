class Solution {
    public boolean isStrictlyPalindromic(int n) {
      
        n=n-2;
        String s1=Integer.toString(n,2);
        int i=0;
        int j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(i)){
                return false;
            }else {
                i++;
                j--;
            }
        }String s2=Integer.toString(n,3);
        int l=0;
        int r=s2.length()-1;
         while(l<r){
            if(s1.charAt(l)!=s1.charAt(r)){
                return false;
            }else {
                l++;
                r--;
            }
        }return true;



        
    }
}