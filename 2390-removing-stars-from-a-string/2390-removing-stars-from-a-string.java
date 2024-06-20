class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }Stack<Character>fin=new Stack<>();
        while(!st.isEmpty()){
            fin.push(st.peek());
            st.pop();
        }String ans="";
        while(!fin.isEmpty()){
            ans+=fin.peek();
            fin.pop();
        }
        return ans;
        
    }
}