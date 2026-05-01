class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int prev = nums[0];
        int j = 1;
        int i = 1;
        while(j<nums.length){
            if(prev == nums[j]){
                j++;
            }
            else{
                count++;
                nums[i++] = nums[j];
                prev = nums[j];
            }
        }
        return count;
    }
}