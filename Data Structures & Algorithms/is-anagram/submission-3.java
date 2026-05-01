class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length()!=t.length())
            return false;
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            if(arr[ch-'a']!=0)
                arr[ch-'a']--;
            else
                return false;
        }
        return true;
    }
}
