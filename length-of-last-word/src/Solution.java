class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int lengthOfLastWord = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (lengthOfLastWord > 0)
                    return lengthOfLastWord;
            } else
                lengthOfLastWord++;
        }
        return lengthOfLastWord;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s));
    }
}