class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            high = Math.max(high, piles[i]);
        }
        while(low<high){
            int mid = low + (high-low)/2;
            System.out.println("low:"+low+" high:"+high+" mid:"+mid);
            if(hoursToEatBanana(piles,mid)<=h){
                high = mid;
            }
            else {
               low = mid+1;
            }
        }
        return low;
    }
    int hoursToEatBanana(int[] piles, int mid){
        int n = piles.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += piles[i]%mid==0?piles[i]/mid:(piles[i]/mid)+1;
        }
        System.out.println("sum:"+sum);
        return sum;
    }
}
