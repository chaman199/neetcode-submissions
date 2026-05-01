class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        if(target > nums[high])
            return nums.length;
        if(target < nums[low])
            return 0;
        while(low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}