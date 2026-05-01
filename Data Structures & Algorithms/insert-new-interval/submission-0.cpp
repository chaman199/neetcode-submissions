class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        map<int,int> m;
        for(vector<int> i:intervals){
            m[i[0]]++;
            m[i[1]]--;
        }
        m[newInterval[0]]++;
        m[newInterval[1]]--;

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
