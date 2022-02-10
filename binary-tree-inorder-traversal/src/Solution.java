import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            result.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode rootRightRight = new TreeNode(6);
        TreeNode rootLeftRight = new TreeNode(5);
        TreeNode rootLeftLeft = new TreeNode(4);

        TreeNode rootLeft = new TreeNode(2, rootLeftLeft, rootLeftRight);
        TreeNode rootRight = new TreeNode(3, null, rootRightRight);
        TreeNode root = new TreeNode(1, rootLeft, rootRight);

        System.out.println(solution.inorderTraversal(root));
    }
}