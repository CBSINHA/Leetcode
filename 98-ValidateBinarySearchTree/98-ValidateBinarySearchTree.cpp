// Last updated: 6/26/2025, 10:42:41 PM
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
    bool BST(TreeNode* root,long min,long max){
        if(root==NULL)return true;
        if(root->val<max&&root->val>min&&BST(root->left,min,root->val)&&BST(root->right,root->val,max))return true;
        else return false;
    }
    bool isValidBST(TreeNode* root) {
        return BST(root,LONG_MIN,LONG_MAX);
    }
};