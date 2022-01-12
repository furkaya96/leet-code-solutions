class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder longestCommonPrefix = new StringBuilder();
        char[] reference = strs[0].toCharArray();
        for (int i = 0; i < reference.length; i++) {
            char currChar = reference[i];
            for (int j = 1; j < strs.length; j++) {
                String str = strs[j];
                if (longestCommonPrefix.length() >= str.length() || currChar != str.charAt(i)) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(currChar);
        }
        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}