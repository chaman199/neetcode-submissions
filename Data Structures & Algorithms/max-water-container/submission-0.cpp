class Solution {
public:
    int maxArea(vector<int>& heights) {
        int n = heights.size();
        int i = 0;
        int j = n-1;
        int maxWater = INT_MIN;
        int trapWater;
        while(i<j){
            if(heights[i]>heights[j]){
                trapWater = heights[j]*(j-i);
                j--;
            }
            else{
                trapWater = heights[i]*(j-i);
                i++;
            }
            maxWater = max(trapWater,maxWater);
        }
        return maxWater;
    }
};
