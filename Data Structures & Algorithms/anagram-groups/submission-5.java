class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            int[] arr = new int[26];
            for(char ch: str.toCharArray()){
                arr[ch-'a']++;
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
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
