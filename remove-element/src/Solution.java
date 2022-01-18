import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int leftIdx = 0;
        int rightIdx = nums.length;

        while (leftIdx < rightIdx) {
            if (nums[leftIdx] == val) {
                nums[leftIdx] = nums[--rightIdx];
            } else {
                leftIdx++;
            }
        }
        return rightIdx;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int[] expectedNums = {0, 0, 1, 3, 4};

        int k = solution.removeElement(nums, val);

        assert k == expectedNums.length;
        Arrays.sort(nums, 0, k);
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}