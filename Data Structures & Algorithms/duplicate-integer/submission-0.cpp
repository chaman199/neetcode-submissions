class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        map<int,int> m;
        for(int ele: nums){
            if(m.find(ele)!=m.end())
                return true;
            else
                m[ele]++;
        }
        return false;
    }
};
