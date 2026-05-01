class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sumArr = new int[n+1];
        for(int i=0;i<n;i++){
            sumArr[i+1] = sumArr[i]+nums[i];
        }
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(sumArr[j]-sumArr[j-i]==k)
                    count++;
            }
        }
        return count;
    }
}