class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string,vector<string>> m;
        int n = strs.size();
        for(int i=0;i<n;i++){
            string tempS = strs[i];
            sort(tempS.begin(),tempS.end());
            if(m.find(tempS)!=m.end()){
                m[tempS].push_back(strs[i]);
            }
            else{
                vector<string> vec;
                vec.push_back(strs[i]);
                m[tempS] = vec;
            }
        }
        vector<vector<string>> ans;
        for(auto ma:m){
            ans.push_back(ma.second);
        }
        return ans;
    }
};
