class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> m;
        int i=0;
        int j=0;
        int n = s.size();
        int max_window = INT_MIN;
        int count=0;
        while(j<n){
            if(m.find(s[j])==m.end()){
                m[s[j]]=j;
            }
            else{
                count = j - i;
                while(i<=m[s[j]]){
                    m.erase(s[i++]);
                }
                m[s[j]]=j;
            }
            max_window = max(count,max_window);
            j++;
        }
        max_window = max(j - i,max_window);
        return max_window;
    }
};
