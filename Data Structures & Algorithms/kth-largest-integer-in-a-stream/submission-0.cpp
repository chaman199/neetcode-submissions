class KthLargest {
public:
    priority_queue <int, vector<int>, greater<int>> hp;
    int k;
    KthLargest(int k, vector<int>& nums) {
        this->k=k;
        for(int i=0;i<nums.size();i++){
            hp.push(nums[i]);
            if(hp.size()>k){
                hp.pop();
            }
        }
    }
    
    int add(int val) {
        hp.push(val);
        if(hp.size()>k){
            hp.pop();
        }
        return hp.top();
    }
};
