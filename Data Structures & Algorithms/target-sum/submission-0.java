class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return f(nums,0,target);
    }
    int f(int[] sum, int i, int target){
        if(target==0 && i==sum.length)
            return 1;
        if(i >= sum.length)
            return 0;
        return f(sum,i+1,target-sum[i]) + f(sum,i+1,target+sum[i]);
    }
}
