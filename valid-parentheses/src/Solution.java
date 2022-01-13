import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> brStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                brStack.push(')');
            } else if (c == '{') {
                brStack.push('}');
            } else if (c == '[') {
                brStack.push(']');
            } else {
                if (brStack.isEmpty() || c != brStack.pop()) {
                    return false;
                }
            }
        }
        return brStack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "([{}])()";
        System.out.println(solution.isValid(s));
    }
}