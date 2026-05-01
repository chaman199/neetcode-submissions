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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur = root;
        TreeNode newNode = new TreeNode(val);
        TreeNode prev = root;
        while(cur!=null){
            prev = cur;
            if(val > cur.val){
                cur = cur.right;
            }
            else
                cur = cur.left;
        }
        if(prev==null)
            return newNode;
        if(val > prev.val)
            prev.right = new TreeNode(val);
        else
            prev.left = new TreeNode(val);

        return root;
    }
}