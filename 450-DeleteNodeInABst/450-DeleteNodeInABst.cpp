// Last updated: 6/26/2025, 10:42:25 PM
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
int Max(TreeNode* root){
    if(root==NULL)return INT_MAX;
    while(root->right!=NULL){
        root=root->right;
    }
    return root->val;
}
// TreeNode* Find(TreeNode* root,int value){
//     if(root==NULL) return root;
//     if(root->val>value) Find(root->left,value);
//     else if(root->val<value) Find(root->right,value);
// }
    TreeNode* deleteNode(TreeNode* root, int key) {
        if(root==NULL)return NULL;
        if(key>root->val){
            root->right=deleteNode(root->right,key);
        }
        else if(key<root->val) root->left=deleteNode(root->left,key);
        else{
            if(root->left==NULL && root->right==NULL){
                 delete root; 
                 root=NULL;
            }
            else if(root->left==NULL){
                TreeNode* temp=root;
                root=root->right;
                delete temp; 
            }
            else if(root->right==NULL){
                TreeNode* temp=root;
                root=root->left;
                delete temp;
            }
            else{
                root->val=Max(root->left);
                root->left=deleteNode(root->left,root->val);
            }
        }
        return root;
    }
};