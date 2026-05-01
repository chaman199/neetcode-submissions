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
        List<Integer> list = new ArrayList<>();
        f(list,root);
        int n = list.size();
        for(int i=0;i<n-1;i++){
            if(list.get(i) >= list.get(i+1))
                return false;
        }
        return true;
    }
    void f(List<Integer> list, TreeNode root){
        if(root==null)
            return;
        f(list,root.left);
        list.add(root.val);
        f(list,root.right);
    }
}
