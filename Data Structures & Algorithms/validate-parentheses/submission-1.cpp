class Solution {
public:
    bool isValid(string s) {
        stack<char> sk;
        for(char ch:s){
            switch(ch){
                case '{':
                case '(':
                case '[':
                    sk.push(ch);
                    break;
                case '}':
                    if(sk.empty())
                        return false;
                    if(sk.top()=='{')
                        sk.pop();
                    else 
                        return false;
                    break;
                case ')':
                    if(sk.empty())
                        return false;
                    if(sk.top()=='(')
                        sk.pop();
                    else 
                        return false;
                    break;
                case ']':
                    if(sk.empty())
                        return false;
                    if(sk.top()=='[')
                        sk.pop();
                    else 
                        return false;
                    break;
            }
        }
        if(sk.empty())
            return true;
        return false;
    }
};
