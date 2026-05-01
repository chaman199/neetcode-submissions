class Solution {
    public int calPoints(String[] operations) {
        List<Integer> records = new ArrayList<>();
        for(String op: operations){
            if(op.equals("+")){
                records.add(records.get(records.size()-1) + records.get(records.size()-2));
            } else if(op.equals("D")) {
                records.add(2*records.get(records.size()-1));
            } else if(op.equals("C")) {
                records.remove(records.get(records.size()-1));
            } else {
                records.add(Integer.parseInt(op));
            }
        }
        Integer sum = 0;
        for(Integer i: records){
            sum += i;
        }
        return sum;
    }
}