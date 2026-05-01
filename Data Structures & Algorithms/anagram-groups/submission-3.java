class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] arr = new int[26];
            for(int j=0;j<strs[i].length();j++){
                arr[strs[i].charAt(j)-'a']++;
            }
            StringBuffer str = new StringBuffer();
            for(int k=0;k<26;k++){
                str.append(k).append("_").append(arr[k]);
            }
            String newS = str.toString();
            if(map.containsKey(newS)){
                List<String> listS = new ArrayList(map.get(newS));
                listS.add(strs[i]);
                map.put(newS,listS);
            }
            else{
                map.put(newS,List.of(strs[i]));
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
