class Solution {
    public int strStr(String haystack, String needle) {
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        int h = haystackArr.length;
        int n = needleArr.length;

        if (n == 0)
            return 0;

        for (int i = 0; i <= h - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystackArr[i + j] != needleArr[j]) {
                    break;
                }
            }
            if (j == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(solution.strStr(haystack, needle));
    }
}