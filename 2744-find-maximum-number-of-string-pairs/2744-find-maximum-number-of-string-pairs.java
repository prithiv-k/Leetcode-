class Solution {
    public int maximumNumberOfStringPairs(String[] w) {
        int count=0;
        for(int i=0;i<w.length;i++){
            String s=w[i];
            String ans="";
            for(int j=s.length()-1;j>=0;j--){
                ans+=s.charAt(j);
            }for(int k=0;k<w.length;k++){
                if(w[k].equals(ans)){
                    count++;
                }
            }
        }return count/2;
    }
}