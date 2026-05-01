class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return sol2(nums);
    }

    public List<Integer> sol1(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>n/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
    public List<Integer> sol2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for(int num: nums){
            if(num!=prev){
                if(count > n/3)
                    ans.add(prev);
                count = 1;
                prev = num;
            }
            else{
                count ++;
            }
        }
        if(count > n/3)
            ans.add(prev);
        return ans;
    }
}