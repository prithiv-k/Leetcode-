
class Solution {
    public String modifyString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                for (char c = 'a'; c <= 'z'; c++) {
                    if ((i > 0 && c == ans.charAt(i - 1)) || (i < s.length() - 1 && c == s.charAt(i + 1))) {
                        continue;
                    }
                    ans.append(c);
                    break;
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
