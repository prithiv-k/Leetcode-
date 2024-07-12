class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        int n=op.length;
        for(int i=0;i<n;i++){
            if(op[i].equals("--X")||op[i].equals("X--")){
                --x;
            }else if(op[i].equals("X++")||op[i].equals("++X")){
                ++x;
            }
        }return x;
    }
}