class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        return f(nums,0);
    }
    vector<vector<int>> f(vector<int>& nums, int startx){
        int n = nums.size();
        if(startx == n)
            return {{}};
        
        vector<vector<int>> subSoln = f(nums,startx+1);
        vector<vector<int>> res;

        res = subSoln;

        vector<int> temp;

        for(int i=0;i<subSoln.size();i++){
            temp = subSoln[i];
            temp.push_back(nums[startx]);
            res.push_back(temp);
        }
        return res;
    }
};
