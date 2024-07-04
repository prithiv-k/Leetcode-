class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&& Math.abs(s.charAt(i)-st.peek())==32){
                st.pop();
            }
        else{
            st.push(s.charAt(i));
        }
        }
        
        Stack<Character> fin=new Stack<>();
        while(!st.isEmpty()){
            fin.push(st.pop());
        }while(!fin.isEmpty()){
            ans+=fin.pop();
        }return ans;
    }
}