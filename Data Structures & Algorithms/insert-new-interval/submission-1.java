class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        Map<Integer,Integer> ans = new TreeMap<>();
        for(int i=0;i<n;i++){
            ans.put(intervals[i][0],ans.getOrDefault(intervals[i][0],0)+1);
            ans.put(intervals[i][1],ans.getOrDefault(intervals[i][1],0)-1);
        }
        ans.put(newInterval[0],ans.getOrDefault(newInterval[0],0)+1);
        ans.put(newInterval[1],ans.getOrDefault(newInterval[1],0)-1);
        int start = 0;
        int initial=0;
        List<int[]> a = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: ans.entrySet()){
            if(start == 0)
                initial = entry.getKey();
            start = start + entry.getValue();
            if(start == 0){
                a.add(new int[]{initial,entry.getKey()});
            }
        }
        return a.stream().toArray(int[][]::new);
    }
}
