class Solution {
public:
    int predicate(vector<int>& piles, int mid){
        int sum = 0;
        for(int i=0;i<piles.size();i++){
            sum += piles[i]%mid==0?piles[i]/mid:(piles[i]/mid)+1;
        }
        return sum;
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int n = piles.size();
        if(n>h)
            return -1;
        int low=1;
        int high=INT_MIN;
        for(int i:piles){
            low = min(low,i);
            high = max(high,i);
        }
        if(n==h)
            return high;
        
        while(low<high){
            int mid = low + (high - low)/2;
            if(predicate(piles,mid)>h){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;

    }
};
