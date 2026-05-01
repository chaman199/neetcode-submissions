class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        String ans = "";
        String num = "";
        for(char ch: s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                num += ch;
            }
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                st2.push(""+ch);
            }
            if(ch=='['){
                st1.push(Integer.parseInt(num));
                st2.push(""+ch);
                num = "";
            }
            if(ch==']')
            {
                String temp = "";
                while(!st2.peek().equals("[")){
                    // System.out.println(st2.peek());
                    String c = st2.pop();
                    temp = c + temp;
                }
                st2.pop();
                int n = st1.pop();
                for(int i=0;i<n;i++) {
                    st2.push(temp);
                }
            }
            // System.out.println(st1);
            // System.out.println(st2);
        }
        while(!st2.isEmpty()){
            ans = st2.pop() + ans;
        }
        return ans;
    }
}