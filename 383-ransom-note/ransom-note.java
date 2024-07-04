class Solution {
    public boolean canConstruct(String ran, String man) {
        char [] ra=ran.toCharArray();
        char [] ma=man.toCharArray();
        if(ra.length>ma.length){
            return false;
        }
        char [] arr=new char[26];
        for(char i:ma){
            arr[i-'a']++;
        }for(char i:ra){
            if(arr[i-'a']==0){
                return false;
            }else{arr[i-'a']--;
            }
        }return true;
    }
}