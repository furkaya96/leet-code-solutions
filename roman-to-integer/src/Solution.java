import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> intByRoman = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int result = 0;
        char[] charArr = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            int curr = intByRoman.get(charArr[i]);
            int prev = intByRoman.get(charArr[i - 1]);
            if (curr > prev) {
                result += curr - 2 * prev;
            } else {
                result += curr;
            }
        }
        return result + intByRoman.get(charArr[0]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "MCMXCIV";
        System.out.println(solution.romanToInt(s));
    }
}
