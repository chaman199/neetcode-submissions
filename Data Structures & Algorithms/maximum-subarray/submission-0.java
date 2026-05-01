class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = -1001;
        for(int i=0;i<nums.length;i++){
            sum = (sum+nums[i]>nums[i])?sum+nums[i]:nums[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
