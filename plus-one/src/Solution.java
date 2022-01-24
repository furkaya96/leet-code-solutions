import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else
                digits[i] = 0;
        }
        if (digits[0] == 0) {
            int[] extendedDigits = new int[digits.length + 1];
            extendedDigits[0] = 1;
            return extendedDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }
}