class Solution {
    public int subarraySum(int[] nums, int k) {
        return sol2(nums,k);
    }

    public int sol1(int[] nums, int k){
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
    public int sol2(int[] nums, int k){
        int n = nums.length;
        int res=0;
        int curSum = 0;
        int diff = 0;
        Map<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        for(int i=0;i<n;i++){
            curSum += nums[i];
            diff = curSum - k;
            res += prefixSum.getOrDefault(diff,0);
            prefixSum.put(curSum, prefixSum.getOrDefault(curSum,0)+1);
        }
        return res;
    }
}