class Solution {
public:
    int countSubstrings(string s) {
        int ans=0;
        int n = s.size();
        for(int i=0;i<n;i++){
            f(s,i,i,ans); // odd length
            f(s,i,i+1,ans); // even length
        }
        return ans;
    }
    void f(string s,int l, int r, int& ans){
        while(l>=0 && r<s.size() && s[l]==s[r]){
                ans = ans + 1;
                l = l - 1;
                r = r + 1;
            }
    }
};
