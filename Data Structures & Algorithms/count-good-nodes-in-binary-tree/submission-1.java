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
    public int goodNodes(TreeNode root) {
        Integer count = 0;
        int maxVal = Integer.MIN_VALUE;
        return countGoodNodes(root,maxVal);
    }
    int countGoodNodes(TreeNode root,Integer maxVal){
        if(root==null)
            return 0;
        if(root.val >= maxVal){
            maxVal = root.val;
            return 1 + countGoodNodes(root.left,maxVal) +
            countGoodNodes(root.right,maxVal);
        }
        return countGoodNodes(root.left,maxVal) +
        countGoodNodes(root.right,maxVal);
    }
}
