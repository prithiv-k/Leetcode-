class Solution {
     int count=0;
    public int totalNQueens(int n) {
  
        char [][]b=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]='.';
            }
        }
        solve(n,0,b);
        return count;

    }
    public void solve(int n,int c,char[][]b){
        
        if(n==c){
            count++;
            return;
        }
            for(int row=0;row<n;row++){
                if(isf(row,c,b,n)){
                    b[row][c]='Q';
                    solve(n,c+1,b);
                    b[row][c]='.';
                }
            }
        
    }
    public boolean isf(int row,int c,char [][]b,int n){
        for(int i=c;i>=0;i--){
            if(b[row][i]=='Q'){
                return false;
            }
        }
        for(int i=row,j=c;i>=0&&j>=0;i--,j--){
            if(b[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row,j=c;i<n&&j>=0;i++,j--){
            if(b[i][j]=='Q'){
                return false;
            }
        }return true;
    }
}