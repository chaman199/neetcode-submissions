class Solution {
public:
    vector<string> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        vector<string> ans;
        gen(n,open,close,ans,"");
        return ans;
    }

    void gen(int n, int open, int close, vector<string>& ans, string res){
        if(open==n && close==n){
            ans.push_back(res);
            return ;
        }
        if(open < n){
            gen(n,open+1,close,ans,res+"(");
        }
        if(close < open){
            gen(n,open,close+1,ans,res+")");
        }
    }
};
