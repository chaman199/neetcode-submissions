class Solution {
    public String longestPalindrome(String s) {
        String maxString = ""+s.charAt(0);
        for(int i=1;i<s.length();i++){
            String so = findOddPalindrome(s,i);
            String se = findEvenPalindrome(s,i);
            String maxoe = so.length()>se.length()?so:se;
            maxString = maxoe.length() > maxString.length()? maxoe:maxString;
        }
        return maxString;
    }

    private String findOddPalindrome(String s,int i){
        int k=1;
        while(i+k<s.length() && i-k>=0 && s.charAt(i+k)==s.charAt(i-k)){
            k++;
        }
        System.out.println("i:"+i+" k:"+k);
        return s.substring(i-k+1,i+k);   
    }
    private String findEvenPalindrome(String s,int i){
        int k=0;
        while(i+k<s.length() && i-k-1>=0 && s.charAt(i+k)==s.charAt(i-k-1)){
            k++;
        }
        System.out.println("i:"+i+" k:"+k);
        return s.substring(i-k,i+k);   
    }
}
