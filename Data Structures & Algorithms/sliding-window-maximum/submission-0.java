class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       TreeMap<Integer, Integer> map = new TreeMap<>();
       for(int i=0;i<k;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int[] ans = new int[nums.length-k+1];
       ans[0]=map.lastKey();
       int l = 1;
       for(int i=k;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i-k])==1){
            map.remove(nums[i-k]);
        }
        else {
            map.put(nums[i-k], map.get(nums[i-k])-1);
        }
        ans[l++]=map.lastKey();
       }
       return ans;
    }
}
