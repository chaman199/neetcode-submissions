class Solution {

    public String encode(List<String> strs) {
        StringBuffer encodedString = new StringBuffer();
        for(int i=0;i<strs.size();i++){
            encodedString.append(strs.get(i).length())
            .append("#").append(strs.get(i));
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int i=0, n= str.length();
        System.out.println(str);
        List<String> ans = new ArrayList<>();
        while(i<n){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1,j+len+1);
            ans.add(s);
            i = j + len + 1;
        }
        return ans;
    }
}
