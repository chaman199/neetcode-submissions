class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int ans = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(ans != nums[i]){
                if(--count<=0)
                {
                    ans = nums[i];
                    count = 0;
                }
            }
            else
                count++;
            
        }
        return ans;
    }
}