class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        int k = 31;
        uint32_t ans=0;
        while(n){
            if( n & 1){
                ans += pow(2,k);
            }
            n = n >> 1;
            k--;
        }
        return ans;
    }
};
