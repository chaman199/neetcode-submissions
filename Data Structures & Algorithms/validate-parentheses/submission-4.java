class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(Character ch : s.toCharArray()){
            switch(ch){
                case ']':
                    if(!st.isEmpty() && st.peek()=='[')
                        st.pop();
                    else
                        return false;
                    break;
                case '}':
                    if(!st.isEmpty() && st.peek()=='{')
                        st.pop();
                    else
                        return false;
                    break;
                case ')':
                    if(!st.isEmpty() && st.peek()=='(')
                        st.pop();
                    else
                        return false;
                    break;
                default:
                    st.push(ch);
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}
