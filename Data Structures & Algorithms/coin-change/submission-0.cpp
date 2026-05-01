class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        vector<int> ans(amount+1,INT_MAX-1);
        ans[0]=0;
        for(int k:coins){
            for(int i=k;i<=amount;i++){
                ans[i] = min(ans[i-k]+1,ans[i]);
            }
        }
        return ans[amount]==INT_MAX-1?-1:ans[amount];
    }
};
