class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        int j = 0;
        StringBuffer str = new StringBuffer();
        while(i<m && j<n){
            str.append(""+word1.charAt(i)).append(""+word2.charAt(j));
            i++;
            j++;
        }
        while(i<m){
            str.append(""+word1.charAt(i));
            i++;
        }
        while(j<n){
            str.append(""+word2.charAt(j));
            j++;
        }
        return str.toString();
    }
}