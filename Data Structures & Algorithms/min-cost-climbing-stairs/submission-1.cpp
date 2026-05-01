class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        for(int i=cost.size()-3;i>=0;i--){
            cost[i] += min(cost[i+1],cost[i+2]);
        }
        return min(cost[0],cost[1]);
        // return min(f(cost,0,0),f(cost,1,0));
    }
    int f(vector<int>& cost, int index, int ans){
        if(index > cost.size()){
            return ans;
        }
        return min(f(cost, index+1, ans + cost[index]),f(cost, index+2, ans + cost[index]));
    }
};
