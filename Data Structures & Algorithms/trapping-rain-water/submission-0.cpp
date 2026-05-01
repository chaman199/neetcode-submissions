class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if(n==1 || n==2)
            return 0;
        int l=0,r=n-1;
        int res = 0;
        int leftMax = height[l], rightMax = height[r];
        while(l<r){
            if(leftMax > rightMax){
                r--;
                rightMax = max(rightMax,height[r]);
                res += rightMax - height[r];

            }
            else{
                l++;
                leftMax = max(leftMax,height[l]);
                res += leftMax - height[l];
            }
        }
        return res;
    }
};
