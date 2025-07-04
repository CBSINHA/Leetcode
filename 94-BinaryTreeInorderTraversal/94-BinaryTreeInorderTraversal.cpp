// Last updated: 6/26/2025, 10:42:43 PM
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
vector<int>v;
void Inorder(TreeNode* root){
    if (root==NULL)return;
    Inorder(root->left);
    v.push_back(root->val);
    Inorder(root->right);
}
    vector<int> inorderTraversal(TreeNode* root) {
        Inorder(root);
        return v;
    }
};