class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> records = new Stack<>();
        for(String op: operations){
            if(op.equals("+")){
                Integer second = records.pop();
                Integer first = records.peek();
                records.push(second);
                records.push(first+second);
            } else if(op.equals("D")) {
                records.add(2*records.peek());
            } else if(op.equals("C")) {
                records.pop();
            } else {
                records.push(Integer.parseInt(op));
            }
        }
        Integer sum = 0;
        while(!records.empty())
            sum += records.pop();
        return sum;
    }
}