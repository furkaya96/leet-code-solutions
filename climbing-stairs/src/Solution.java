class Solution {
    public int climbStairs(int n) {
        int twoSteps = 1, oneStep = 1;
        for (int i = n - 2; i >= 0; i--) {
            int temp = oneStep;
            oneStep = oneStep + twoSteps;
            twoSteps = temp;
        }
        return oneStep;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        System.out.println(solution.climbStairs(n));
    }
}