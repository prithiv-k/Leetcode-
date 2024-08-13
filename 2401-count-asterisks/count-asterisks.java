class Solution {
    public int countAsterisks(String s) {
        Stack<Character> st=new Stack<>();
        int iv=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(st.isEmpty()){
                    st.push('|');
                } else{
                    if(st.peek()=='|'&&s.charAt(i)=='|'){
                        st.pop();
                    }
                }
            }else if(st.isEmpty()){
                if(s.charAt(i)=='*'){
                    iv++;
                }else if(s.charAt(i)=='|'){
                    st.push('|');
                }else{
                    continue;
                }

            }
        }return iv;
    }
}