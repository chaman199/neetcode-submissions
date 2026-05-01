class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n,1);
        if(n==1)
            return 1;
        int maxEle = INT_MIN;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] < nums[j]){
                    ans[j] = max(ans[i]+1,ans[j]);
                }
                maxEle = max(maxEle,ans[j]);
            }
        }
        return maxEle;
    }
};
