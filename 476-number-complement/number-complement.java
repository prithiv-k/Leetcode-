class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans+='0';
            }else{
                ans+='1';
            }
            
        }return Integer.parseInt(ans,2);
    }
}