class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int count = 1;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(!set.contains(val-1)){
                int tempCount = 0;
                while(set.contains(val)){
                    val = val+1;
                    tempCount += 1;
                }
                count = Math.max(count,tempCount);
            }
        }
        return count;
    }
}
