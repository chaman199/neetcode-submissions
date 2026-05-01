class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums)
            set.add(num);
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int cur = nums[i];
            if(!set.contains(cur-1)){
                while(set.contains(cur)){
                    cur++;
                }
                res = Math.max(res,cur-nums[i]);
            }
        }
        return res;
    }
}
