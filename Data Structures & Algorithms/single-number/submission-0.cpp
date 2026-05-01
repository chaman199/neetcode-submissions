class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int val = 0;
        for(int v:nums){
            val = val ^ v;
        }
        return val;
    }
};
