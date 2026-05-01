class Solution {
public:
    bool isHappy(int n) {
        int slow = n;
        int fast = sumofsquare(n);
        while(slow!=fast){
            fast = sumofsquare(sumofsquare(fast));
            slow = sumofsquare(slow);
        }
        if(fast==1)
            return true;
        return false;
    }

    int sumofsquare(int n){
        int sum = 0;
        while(n){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }
};
