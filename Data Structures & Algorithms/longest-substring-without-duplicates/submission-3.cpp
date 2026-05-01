class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> m;
        int i=0;
        int j=0;
        int n = s.size();
        int max_window = 0;
        int count=0;
        while(j<n){
            if(m.find(s[j])!=m.end()){
                while(i<=m[s[j]]){
                    m.erase(s[i++]);
                }
            }
            m[s[j]]=j;
            max_window = max(j - i + 1,max_window);
            j++;
        }
        return max_window;
    }
};
