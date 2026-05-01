class Solution {
public:

    string encode(vector<string>& strs) {
        string ans;
        for(int i=0;i<strs.size();i++){
            ans += to_string(strs[i].size()) + "#" + strs[i];
        }
        cout<<ans;
        return ans;
    }

    vector<string> decode(string s) {
        int i=0,j=0;
        int n = s.size();
        vector<string> ans;
        while(j<n){
            if(s[j]=='#'){
                // cout<< s.substr(i,j-i) << "\n";
                int size = stoi(s.substr(i,j-i));
                ans.push_back(s.substr(j+1,size));
                j += size ;
                i = j+1;
            }
            j++;
        }
        return ans;
    }
};
