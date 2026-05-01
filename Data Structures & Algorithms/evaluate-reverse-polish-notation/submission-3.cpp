class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        int res=0;
        string a,b;
        for(string val: tokens){
            if(val!="+" && val!="-" && val!="/" && val!="*"){
                st.push(stoi(val));
            }
            else{
                int b = st.top();
                st.pop();
                int a = st.top();
                st.pop();
                int c;
                if(val == "+"){
                    c = a + b;
                } 
                else if( val == "-"){
                    c = a - b;
                }
                else if( val == "*"){
                    c = a * b;
                }
                else{
                    c = a/b ;
                }
                st.push(c);
            }
        }
        return st.top();
    }
};
