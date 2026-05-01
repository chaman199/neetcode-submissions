class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int curSum = 0;
        int diff = 0;
        Map<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        for(int i=0;i<n;i++){
            curSum += nums[i];
            diff = curSum - k;
            count += prefixSum.getOrDefault(diff,0);
            prefixSum.put(curSum,prefixSum.getOrDefault(curSum,0)+1);
        }
        return count;
    }
}