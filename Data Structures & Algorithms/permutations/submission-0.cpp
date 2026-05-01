class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> curSet;
        f(nums,res,curSet);
        return res;
    }

    void f(vector<int> nums, vector<vector<int>>& res, vector<int> curSet){
        if(nums.size() == 0){
            res.push_back(curSet);
            return;
        }
        for(int i=0;i<nums.size();i++){
            int temp = nums[i];
            curSet.push_back(nums[i]);
            nums.erase(nums.begin()+i);
            f(nums,res,curSet);
            curSet.pop_back();
            nums.insert(nums.begin()+i,temp);
        }
    }
};
