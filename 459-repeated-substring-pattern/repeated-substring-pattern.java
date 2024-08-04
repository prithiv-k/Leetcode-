class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        String ans=x.substring(1,x.length()-1);
        return ans.contains(s);
    }
}