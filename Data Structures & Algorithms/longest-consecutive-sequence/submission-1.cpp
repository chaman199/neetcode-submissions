class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        if(n==0 || n==1)
            return n;
        sort(nums.begin(),nums.end());
        int maxCount = 1;
        int localCount = 1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])
                continue;
            if(nums[i]-1==nums[i-1])
                localCount++;
            else{
                localCount = 1;
            }
            maxCount = max(maxCount,localCount);
        }
        return maxCount;
    }
};
