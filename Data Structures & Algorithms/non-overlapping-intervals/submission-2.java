class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int end = Integer.MIN_VALUE;
        for(int[] arr: intervals){
            if(arr[0] >= end){
                count++;
                end = arr[1];
            }
        }
        return intervals.length - count;
    }
}
