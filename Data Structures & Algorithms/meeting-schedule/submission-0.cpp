/**
 * Definition of Interval:
 * class Interval {
 * public:
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 * }
 */

class Solution {
public:
    bool canAttendMeetings(vector<Interval>& intervals) {
        map<int,int> m;
        for(Interval k: intervals){
            m[k.start]++;
            m[k.end]--;
        }
        int count=0;
        for(auto mp:m){
            count += mp.second;
            if(count > 1){
                return false;
            }
        }
        return true;
    }
};
