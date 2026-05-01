class Solution {
    public String customSortString(String order, String s) {
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr,(a,b) -> order.indexOf(a)-order.indexOf(b));
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();

    }

}