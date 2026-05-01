class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int m = firstList.length;
        int n = secondList.length;
        if(m==0 || n==0)
            return new int[][]{};
        int i = 0;
        int j = 0;
        List<int[]> ans = new ArrayList<>();
        while(i<m && j<n){
            if(!(firstList[i][1] < secondList[j][0] || firstList[i][0] > secondList[j][1])){
                ans.add(new int[]{Math.max(firstList[i][0],secondList[j][0]),Math.min(firstList[i][1],secondList[j][1])});
            }
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}