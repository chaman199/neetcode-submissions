class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int first,second,ans;
        for(String token: tokens){
            switch(token){
                case "+":
                    second = stack.pop();
                    first = stack.pop();
                    ans = first + second;
                    stack.push(ans);
                break;
                case "-":
                    second = stack.pop();
                    first = stack.pop();
                    ans = first - second;
                    stack.push(ans);
                break;
                case "*":
                    second = stack.pop();
                    first = stack.pop();
                    ans = first * second;
                    stack.push(ans);
                break;
                case "/":
                    second = stack.pop();
                    first = stack.pop();
                    ans = first / second;
                    stack.push(ans);
                break;
                default:
                    stack.push(Integer.parseInt(token));

            }
        }
        return stack.peek();
    }
}
