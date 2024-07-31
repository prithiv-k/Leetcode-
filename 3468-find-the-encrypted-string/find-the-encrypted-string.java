class Solution {
    public String getEncryptedString(String s, int k) {
        Queue<Character> li=new LinkedList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            li.add(s.charAt(i));
        }
        for(int i=0;i<k;i++){
            li.add(li.remove());
        }String ans="";
        while(!li.isEmpty()){
            ans+=li.remove();
        }return ans;
    }
}