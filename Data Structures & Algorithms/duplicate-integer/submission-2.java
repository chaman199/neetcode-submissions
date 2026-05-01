class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int ele: nums){
            if(map.contains(ele)){
                return true;
            }
            else
                map.add(ele);
        }
        return false;
    }
}
