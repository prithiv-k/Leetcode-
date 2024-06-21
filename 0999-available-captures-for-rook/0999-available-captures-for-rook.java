class Solution {
    public int numRookCaptures(char[][] board) {
        int tot=1,a=0,b=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                    tot=0;
                    a=i;b=j;
                    break;
                }
            }if(tot==0){
                break;
            }
        }for(int i=a-1;i>=0;i--){
            if(board[i][b]=='B'){
                break;
            }
            if(board[i][b]=='p'){
                tot++;
                break;
            } 
        }for(int i=a+1;i<board.length;i++){
            if(board[i][b]=='B'){
                break;
            }
            if(board[i][b]=='p'){
                tot++;
                break;
            }
        }for(int i=b-1;i>=0;i--){
            if(board[a][i]=='B'){
                break;
            }if(board[a][i]=='p'){
                tot++;
                break;
            }
        }for(int i=b+1;i<board[0].length;i++){
            if(board[a][i]=='B'){
                break;
            }if(board[a][i]=='p'){
                tot++;
                break;
            }
        }
        return tot;
       }
}