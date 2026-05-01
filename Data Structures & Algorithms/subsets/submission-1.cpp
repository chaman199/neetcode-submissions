class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> curSet;
        f(nums,0,res,curSet);
        return res;
    }
    void f(vector<int>& nums, int startx,vector<vector<int>>& res,vector<int> curSet){
        int n = nums.size();
        if(startx == n)
        {
            res.push_back(curSet);
            return;
        }
        f(nums,startx+1,res,curSet);
        curSet.push_back(nums[startx]);
        f(nums,startx+1,res,curSet);
        
    }
};
