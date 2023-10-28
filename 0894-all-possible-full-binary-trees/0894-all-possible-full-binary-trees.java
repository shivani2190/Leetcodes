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
    public List<TreeNode> allPossibleFBT(int n) {
       List<TreeNode> rst = new ArrayList<>();
        if(n==1)
            rst.add(new TreeNode(0));
        n-=1;
        for(int i=1;i<=n;i+=2)
        {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n-i);
            for(TreeNode l: left)
            {
                for(TreeNode r: right)
                {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    rst.add(root);
                }
            }
        }
        
        return rst; 
    }
}