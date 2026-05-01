class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.offer(new int[]{entry.getValue(),entry.getKey()});
            if(maxHeap.size() > k)
                maxHeap.poll();
        }

        int[] res = new int[k];
        for(int i=0;i<k;i++)
            res[i] = maxHeap.poll()[1];
        return res;
    }
}
