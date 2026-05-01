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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return diameter;
    }
    int findDiameter(TreeNode root)
    {
        if(root==null)
            return 0;
        int left = 1 + findDiameter(root.left);
        int right = 1 + findDiameter(root.right);
        diameter = Math.max(left+right-2,diameter);
        return Math.max(left,right);
    }
}
