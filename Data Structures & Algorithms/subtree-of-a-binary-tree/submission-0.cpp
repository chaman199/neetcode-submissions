/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        bool ans = false;
        f(root,subRoot,ans);
        return ans;
    }
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(!p && !q)
            return true;
        if((p && !q) || (!p && q)){
            return false;
        }
        if(p->val != q->val)
            return false;
        return isSameTree(p->left,q->left) && isSameTree(p->right,q->right);
    }
    void f(TreeNode* root, TreeNode* subRoot, bool& ans){
        if(!root)
            return;
        if(root->val == subRoot->val){
            if(isSameTree(root,subRoot)){
                ans = true;
                return;
            }
        }
        f(root->left,subRoot,ans);
        f(root->right,subRoot,ans);
    }
};
