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
    int goodNodes(TreeNode* root) {
        int min=root->val;
        int count = 0;
        f(root,min,count);
        return count;
    }

    void f(TreeNode* root, int min, int& count){
        if(!root)
            return ;
        if(root->val >= min){
            count+=1;
        }
        f(root->left,max(root->val,min),count);
        f(root->right,max(root->val,min),count);
    }
};
