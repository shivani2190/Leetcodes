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
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
      
        // Case when both left and right child nodes are null
        if (root.left == null && root.right == null) {
            return Integer.toString(root.val);
        }
      
        // Case when only the right child node is null
        if (root.right == null) {
            return root.val + "(" + tree2str(root.left) + ")";
        }
      
        // Case when both child nodes are not null
        // Note: The right child node is represented even when it might be null,
        //       because the left child node is not null, and its existence must be acknowledged
        return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
    }
}