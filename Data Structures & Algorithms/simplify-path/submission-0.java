class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> st = new Stack<>();
        for(String str: split){
            if(str.isEmpty() || str.equals(".")){
                continue;
            } else if(str.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            } else{
                st.push(str);
            }
        }
        String sb = "";
        while(!st.isEmpty()){
            sb = "/"+st.pop()+sb;
        }
        return sb==""?"/":sb;
    }
}