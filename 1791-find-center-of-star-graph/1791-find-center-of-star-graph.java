class Solution {
    public int findCenter(int[][] edges) {
        int a=edges[0][0];
        int b=edges[0][1];
        int c=edges[1][0];
        int d=edges[1][1];
        if(a==c){
            return a;
        }if(b==c){
            return b;
        }if(a==d){
            return a;
        }if(b==d){
            return d;
        }return -1;
    }
}