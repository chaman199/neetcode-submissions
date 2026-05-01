class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<vector<int>,vector<string>> m;
        int n = strs.size();
        vector<vector<string>> ans;

        for(int i=0;i<n;i++){
            vector<int> vec(26,0);
            for(int j=0;j<strs[i].size();j++){
                vec[strs[i][j]-'a']++;
            }
            m[vec].push_back(strs[i]);
        }
        for(auto ma:m){
            ans.push_back(ma.second);
        }
        return ans;
    }
};
