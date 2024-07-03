class Solution {
    public int[] evenOddBit(int n) {
        String rev=Integer.toBinaryString(n);
        
        int even=0;int odd=0;
        String s="";
        for(int i=rev.length()-1;i>=0;i--){
            s+=rev.charAt(i);
        }
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'&&i%2==0){
                even++;
            }else if(s.charAt(i)=='1'&&i%2!=0){
                odd++;
            }
        
        }
        int arr[]={even,odd};
            return arr;
        
        
        
    }
}