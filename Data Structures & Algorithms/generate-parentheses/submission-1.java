class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        gen(n,0,0,ans,"");
        return ans;
    }
    void gen(int n, int close, int open, List<String> ans, String s){
        if(close==n && open==n){
            ans.add(s);
            return;
        }
        if(open < n)
            gen(n,close,open+1,ans,s+"(");
        if(close < open)
            gen(n,close+1,open,ans,s+")");
    }
}
