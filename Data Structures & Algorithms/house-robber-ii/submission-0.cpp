class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        int first = 0;
        int second = nums[0];
        for(int i=2;i<n;i++){
            int temp = max(nums[i-1]+first, second);
            first = second;
            second = temp;
        }
        int max1 = second;
        first = 0;
        second = 0;
        for(int i=2;i<=n;i++){
            int temp = max(nums[i-1]+first, second);
            first = second;
            second = temp;
        }
        return max(second,max1);
    }
};
