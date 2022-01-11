import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexByNum.containsKey(complement)) {
                return new int[]{i, indexByNum.get(complement)};
            }
            indexByNum.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
