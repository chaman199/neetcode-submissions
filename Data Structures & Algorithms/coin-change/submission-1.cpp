class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        vector<int> ans(amount+1,amount+1);
        ans[0]=0;
        for(int k:coins){
            for(int i=k;i<=amount;i++){
                ans[i] = min(ans[i-k]+1,ans[i]);
            }
        }
        return ans[amount]>amount?-1:ans[amount];
    }
};
