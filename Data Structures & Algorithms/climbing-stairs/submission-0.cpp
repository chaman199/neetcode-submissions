class Solution {
public:
    int climbStairs(int n) {
        int ans = 0;
        f(n,ans);
        return ans;
    }
    void f(int n, int& ans){
        if(n==0){
            ans++;
            return;
        }
        if(n<0)
            return ;
        f(n-1,ans);
        f(n-2,ans);
    }
};
