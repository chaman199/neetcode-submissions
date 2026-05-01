class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int,int> count;
        vector<vector<int>> vec(n+1);
        for(int i: nums){
            count[i]++;
        }
        for(auto m:count){
            vec[m.second].push_back(m.first);
        }
        vector<int> ans;
        for(int i=vec.size()-1;i>=0;i--){
            for(int j=0;j<vec[i].size();j++){
                ans.push_back(vec[i][j]);
                if(ans.size()==k){
                    return ans;
                }
            }
        }
        return ans;
    }
};
