class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        map<int,int> m;
        for(vector<int> i:intervals){
            m[i[0]]++;
            m[i[1]]--;
        }
        
        vector<vector<int>> ans;
        int count = 0;
        int start;
        bool startFlag = false;
        for(auto mp: m){
            count += mp.second;
            if(!startFlag){
                start = mp.first;
                startFlag = true;
            }
            if(startFlag && count==0){
                ans.push_back({start,mp.first});
                startFlag = false;
            }
        }
        return ans;
    }
};
