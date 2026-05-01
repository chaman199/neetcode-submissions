class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            String finalStr = getString(str);
            if(map.containsKey(finalStr)){
                List<String> ls = new ArrayList<>(map.get(finalStr));
                ls.add(str);
                map.put(finalStr,ls);
            }
            else{
                map.put(finalStr,List.of(str));
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

    private String getString(String str){
        int[] arr = new int[26];
        for(char ch: str.toCharArray()){
            arr[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            if(arr[i]!=0)
                sb.append('a'+i).append(arr[i]);
        }
        return sb.toString();
    }
}
