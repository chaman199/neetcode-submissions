class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        int first = 0;
        int second = nums[0];
        for(int i=2;i<=n;i++){
            int temp = max(nums[i-1]+first, second);
            first = second;
            second = temp;
        }
        return second;
    }

    int f(vector<int>& nums, int sum,int index){
        if(index >= nums.size()){
            return sum;
        }
        return max(f(nums,sum+nums[index],index+2),f(nums,sum,index+1));
    }
};
