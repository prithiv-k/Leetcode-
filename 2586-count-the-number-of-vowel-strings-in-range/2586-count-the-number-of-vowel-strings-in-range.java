class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int l = 0;
            int r = s.length() - 1;
            
           
                if (s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o'
                        || s.charAt(l) == 'u' && s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i'
                        || s.charAt(r) == 'o' || s.charAt(r) == 'u') {
                    ans++;
                    
                }
            }
        return ans-1;
    }
}