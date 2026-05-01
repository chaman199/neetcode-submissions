class Solution {
public:
    string longestPalindrome(string s) {
        int ans=0;
        string res = "";
        int n = s.size();
        for(int i=0;i<n;i++){
            f(s,i,i,ans,res);
            f(s,i,i+1,ans,res);
        }
        return res;
    }
    void f(string s,int l, int r, int& ans,string& res){
        while(l>=0 && r<s.size() && s[l]==s[r]){
                if(r-l+1 > ans){
                    res = s.substr(l,r-l+1);
                    ans = r - l + 1;
                }
                l = l - 1;
                r = r + 1;
            }
    }
};
