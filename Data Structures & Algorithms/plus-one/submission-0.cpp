class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int sum = 0;
        int rem = 1;
        int n = digits.size();
        for(int i=n-1;i>=0;i--){
            sum = rem + digits[i];
            digits[i] = sum%10;
            rem = sum/10;
        }
        if(rem)
            digits.insert(digits.begin(),rem);
        return digits;
    }
};
