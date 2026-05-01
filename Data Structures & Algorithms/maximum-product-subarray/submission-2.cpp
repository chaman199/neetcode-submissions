class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size();
        int curmax = 1;
        int curmin = 1;
        int ans = nums[0];
        for(int i=0;i<n;i++){
            int temp = nums[i]*curmax;
            curmax = max(max(curmax*nums[i],curmin*nums[i]),nums[i]);
            curmin = min(min(temp,curmin*nums[i]),nums[i]);
            ans = max(curmax,ans);
        }
        return ans;
    }
};
