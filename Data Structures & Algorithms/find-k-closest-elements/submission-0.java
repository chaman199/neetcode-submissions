class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r=0;
        int sum = 0;
        int ol = 0, or= k-1;
        for(int i=0;i<k;i++){
            sum += Math.abs(x-arr[i]);
        }
        r = k;
        while(r<arr.length){
            int prev = sum;
            sum = sum - Math.abs(x-arr[l]) + Math.abs(x-arr[r]);
            l++;
            if(sum < prev)
            {
                prev = sum ;
                ol = l;
                or = r;
            }
            r++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=ol;i<=or;i++){
            ans.add(arr[i]);
        }
        return ans;
        
    }
}