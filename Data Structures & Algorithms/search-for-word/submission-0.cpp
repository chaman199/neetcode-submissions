class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        int n = board.size();
        int m = board[0].size();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(checkForWord(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    bool checkForWord(vector<vector<char>> board,string word, int i,int j, int index){
        int n = board.size();
        int m = board[0].size();
        if(word.size()==index)
            return true;
        if(i<0 || i>=n || j<0 || j>=m || board[i][j] == '0' || board[i][j]!=word[index]){
            // cout << "i:"<< i<<" j:"<<j<<"\n";
            return false;
        }
        // cout<< word[index]<<" "<<board[i][j]<<"\n";
        
        board[i][j] = '0';
        return checkForWord(board,word,i+1,j,index+1)
            || checkForWord(board,word,i,j+1,index+1)
            || checkForWord(board,word,i-1,j,index+1)
            || checkForWord(board,word,i,j-1,index+1);

    }


};
