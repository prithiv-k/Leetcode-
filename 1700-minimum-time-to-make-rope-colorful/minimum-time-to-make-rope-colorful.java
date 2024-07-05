class Solution {
    public int minCost(String col, int[] nt) {
        int c=0;
        for(int i=0;i<col.length()-1;i++){
            
                if( col.charAt(i)==col.charAt(i+1)){
                    int max=Math.max(nt[i],nt[i+1]);
                    c+=Math.min(nt[i],nt[i+1]);
                    nt[i+1]=max;
                    
                }
            
        }return c;
        
    }
}