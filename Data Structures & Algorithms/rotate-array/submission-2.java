class Solution {
    public void rotate(int[] nums, int k) {
        int i = 0;
        int mid = nums.length-k%nums.length-1;
        int j = nums.length - 1;
        reverse(nums,i,mid);
        reverse(nums,mid+1,j);
        reverse(nums,i,j);
    }

    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }


}