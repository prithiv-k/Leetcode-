class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
         rec(ans,0,0,"",n);
         return ans;
    }
    public void rec(List<String> ans, int o, int c, String s, int n) {
       if(o<n){
            rec(ans,o+1,c,s+"(",n);
            
        
       }
        
        
        if(c<o){
            rec(ans,o,c+1,s+")",n);
        } if(s.length()==n*2){
            ans.add(s);
            return;
        }
    }
}

 