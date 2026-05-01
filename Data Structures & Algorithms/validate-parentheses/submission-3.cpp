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
                    if(sk.empty() || sk.top()!='{')
                        return false;
                    sk.pop();
                    break;
                case ')':
                    if(sk.empty() || sk.top()!='(')
                        return false;
                    sk.pop();
                    break;
                case ']':
                    if(sk.empty() || sk.top()!='[')
                        return false;
                    sk.pop();
                    break;
            }
        }
        if(sk.empty())
            return true;
        return false;
    }
};
