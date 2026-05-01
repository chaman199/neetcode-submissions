class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            String newS = new String(s);
            char[] arr = newS.toCharArray();
            Arrays.sort(arr);
            newS = new String(arr);
            if(map.containsKey(newS)){
                List<String> listS = new ArrayList(map.get(newS));
                listS.add(s);
                map.put(newS,listS);
            }
            else{
                map.put(newS,List.of(s));
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
