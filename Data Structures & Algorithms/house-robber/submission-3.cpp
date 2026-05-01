class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n+1,0);
        ans[1]=nums[0];
        for(int i=2;i<=n;i++){
            ans[i] = max(nums[i-1]+ans[i-2], ans[i-1]);
        }
        return ans[n];
    }

    int f(vector<int>& nums, int sum,int index){
        if(index >= nums.size()){
            return sum;
        }
        return max(f(nums,sum+nums[index],index+2),f(nums,sum,index+1));
    }
};
