class Solution {
public:
    bool isAnagram(string s, string t) {
        int sSize = s.size();
        int tSize = t.size();
        if(sSize!=tSize){
            return false;
        }
        vector<int> vec(26,0);
        for(int i=0;i<sSize;i++){
            vec[s[i]-'a']++;
            vec[t[i]-'a']--;
        }
        for(int i=0;i<26;i++){
            if(vec[i]!=0){
                return false;
            }
        }
        return true;
    }
};
