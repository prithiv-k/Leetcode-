class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        Set<Character> st=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(s.charAt(r));
            max=Math.max(max,r-left+1);
        }
        return max;
    }
}