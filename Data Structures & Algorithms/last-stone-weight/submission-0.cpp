class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> mh(stones.begin(),stones.end());
        while(mh.size()>1){
            int a = mh.top();
            mh.pop();
            int b = mh.top();
            mh.pop();
            int ans = b>a?b-a:a==b?0:a-b;
            if(ans!=0)
                mh.push(ans);
        }
        if(mh.size())
            return mh.top();
        return 0;
        
    }
};
