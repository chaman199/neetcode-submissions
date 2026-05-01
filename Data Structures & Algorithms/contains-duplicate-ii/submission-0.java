class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        while(j<nums.length){
            if(set.contains(nums[j]))
            {
                return true;
            }
            set.add(nums[j++]);
            if(set.size()>k)
            {
                set.remove(nums[i++]);
            }
        }
        return false;
    }
}