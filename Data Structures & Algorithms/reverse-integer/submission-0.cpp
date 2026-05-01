class Solution {
public:
    int reverse(int x) {
        long signed number = 0;
        bool neg = x<0;
        while(x){
            number = number*10 + x%10;
            x = x/10;
        }
        if((neg && -1*number < INT_MIN) || (!neg && number > INT_MAX)){
            return 0;
        }
        return (int)number;
    }
};
