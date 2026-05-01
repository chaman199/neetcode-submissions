class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return sol3(nums);
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
    public List<Integer> sol3(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.size()>2){
                Map<Integer,Integer> newMap = new HashMap<>();
                for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                    if(entry.getValue()>1){
                        newMap.put(entry.getKey(),entry.getValue()-1);
                    }
                }
                map = newMap;
            }
        }
        for(int key: map.keySet()){
            int count = 0;
            for(int num:nums){
                if(num == key) count++;
            }
            if(count > n/3) ans.add(key);
        }
        return ans;
    }
}