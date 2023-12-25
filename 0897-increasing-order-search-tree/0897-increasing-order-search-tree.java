/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = new TreeNode(0);
        TreeNode target = result;
        List<Integer> tmpResult = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode top = stack.pop();

            result.right = new TreeNode(top.val);
            result.left = null;
            result = result.right;

            root = top.right;
        }
        for (Integer i: tmpResult) {
            result.right = new TreeNode(i);
            result.left = null;
            result = result.right;
        }
        return target.right;
    }
}