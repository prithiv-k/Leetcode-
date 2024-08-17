class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> li=new ArrayList<>();
        char b[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]='.';
            }
        }
        solve(li,n,0,b);
        return li;
    }
    static void solve(List<List<String>> li,int n,int c,char[][]b){
        if(n==c){
            List<String> h=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    s+=b[i][j];
                }h.add(s);
            }               
            li.add(new ArrayList<>(h));


        }else{
            for(int row=0;row<n;row++){
                if(isf(row,n,b,c)){
                    b[row][c]='Q';
                    solve(li,n,c+1,b);
                    b[row][c]='.';
                }
            }
        }
    }
    static boolean isf(int row,int n,char[][] b,int c){
        for(int i=c-1;i>=0;i--){
            if(b[row][i]=='Q'){
                return false;
            }
        }
            for(int i=row+1,j=c-1;i<n&&j>=0;i++,j--){
                if(b[i][j]=='Q'){
                    return false;
                }
            }for(int i=row-1,j=c-1;i>=0&&j>=0;i--,j--){
                if(b[i][j]=='Q'){
                    return false;
                }
            }
        return true;
    }
}