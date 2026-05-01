class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        set<vector<int>> res;
        vector<int> curSet;
        f(nums,0,res,curSet);
        vector<vector<int>> ans(res.begin(),res.end());
        return ans;
    }
    void f(vector<int>& nums, int startx,set<vector<int>>& res,vector<int> curSet){
        int n = nums.size();
        if(startx == n)
        {
            res.insert(curSet);
            return;
        }
        f(nums,startx+1,res,curSet);
        curSet.push_back(nums[startx]);
        f(nums,startx+1,res,curSet);
        
    }
};
