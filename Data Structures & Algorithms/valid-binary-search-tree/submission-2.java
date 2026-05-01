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
    public boolean isValidBST(TreeNode root) {
        int max_value = 1001;
        int min_value = -1001;
        return f(root,min_value,max_value);
    }
    boolean f(TreeNode root, int min, int max){
        if(root==null)
            return true;
        if(root.val <= min || root.val >= max)
            return false;
        return f(root.left,min,root.val)
         && f(root.right,root.val,max);
    }
}
