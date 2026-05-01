class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0 || n==1)
            return n;
        int i = 0;
        int j = 1;
        int ans = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        while(j<n){
            if(set.contains(s.charAt(j))){
                char temp = s.charAt(j);
                while(s.charAt(i)!=temp){
                    set.remove(s.charAt(i));
                    i++;
                }
                i = i + 1;
            }
            set.add(s.charAt(j));
            j += 1;
            ans = Math.max(ans,j-i);
        }
        return ans;
    }
}
