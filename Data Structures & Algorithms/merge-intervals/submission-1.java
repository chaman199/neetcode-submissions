class Solution {
    public int[][] merge(int[][] intervals) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int[] k: intervals){
            map.put(k[0],map.getOrDefault(k[0],0)+1);
            map.put(k[1],map.getOrDefault(k[1],0)-1);
        }
        boolean k = false;
        int sum = 0;
        int start = map.firstKey();
        int end;
        List<List<Integer>> list = new ArrayList<>();
        for(int key: map.keySet())
        {
            if(sum==0)
                start = key;
            sum += map.get(key);
            System.out.println(sum);
            if(sum==0){
                list.add(List.of(start,key));
            }
        }
        int[][] ans = new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}
