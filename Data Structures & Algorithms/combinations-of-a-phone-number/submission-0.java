class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList();
        HashMap<Character,String> m = new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        List<String> l = new ArrayList();
        f(digits,m,l,"",0);
        return l;
    }

    public void f(String digits, HashMap<Character,String> m, List<String> l, String val, Integer index){
        // System.out.println("val: "+val+" index:"+index);
        if(val.length() == digits.length()){
            l.add(val);
            return ;
        }
        for(int i=index;i<digits.length();i++){
            String s = m.get(digits.charAt(i));
            for(int j=0; j<s.length();j++){
                f(digits,m,l,val+s.charAt(j),i+1);
            }
        }
    }
}
