class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& nums, int target) {
        vector<vector<int>> res;
        vector<int> curSet;
        f(nums,target,0,res,curSet);
        return res;
    }

    void f(vector<int>& nums, int target, int start, vector<vector<int>>& res, vector<int> curSet){
        if(target == 0){
            res.push_back(curSet);
            return;
        }
        if(target < 0 || start == nums.size())
            return;
        f(nums,target,start+1,res,curSet);
        curSet.push_back(nums[start]);
        f(nums,target-nums[start],start,res,curSet);
    }
};
