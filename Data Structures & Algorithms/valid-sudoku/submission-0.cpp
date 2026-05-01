class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char val = board[i][j];
                    board[i][j] = '.';
                    if(!checkValidity(board,i,j,val)){
                        return false;
                    }
                    board[i][j] = val;
                }
            }
        }
        return true;
    }

    bool checkValidity(vector<vector<char>>& board, int i, int j,char ele){
        for(int k=0;k<9;k++){
            if(board[i][k]==ele){

                return false;
            }
            if(board[k][j]==ele){
                return false;
            }
        }
        int row = 3*(i/3);
        int col = 3*(j/3);
        for(int k=row;k<row+3;k++){
            for(int l=col;l<col+3;l++){
                if(board[k][l]==ele){
                    return false;
                }
            }
        }
        return true;
    }
};
