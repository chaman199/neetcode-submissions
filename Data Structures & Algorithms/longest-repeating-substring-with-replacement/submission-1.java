class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        Integer i = 0;
        Integer j = 0;
        int n = s.length();
        int ans = 0;
        int maxe = 0;
        while(j<n){
            arr[s.charAt(j)-'A']++;
            maxe = Math.max(arr[s.charAt(j)-'A'],maxe);
            if(j-i+1-maxe>k){
                arr[s.charAt(i)-'A']--;
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
