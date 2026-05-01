class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        int[] orderArr = new int[26];
        for(int i=0;i<order.length();i++){
            orderArr[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<n-1;i++){
            String word1 = words[i];
            String word2 = words[i+1];
            
            for(int j=0;j<word1.length();j++){
                if(j>=word2.length() && j<word1.length())
                    return false;
                if(word1.charAt(j)==word2.charAt(j))
                    continue;
                if(orderArr[word1.charAt(j)-'a'] < orderArr[word2.charAt(j)-'a'])
                    break;
                return false;
            }
        }
        return true;
    }
}