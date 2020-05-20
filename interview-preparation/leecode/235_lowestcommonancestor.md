# 235\_lowestCommonAncestor

```cpp

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    
    bool checkExists(TreeNode * root, TreeNode * k){
        if(!root)
            return false;
        if(k==root)
            return true;
        return checkExists(root->left, k) || checkExists(root->right, k);
    }
    
    
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
     
        if(!root || p == root || q == root)
            return root;
        
        bool pOnLeftSide = checkExists(root->left, p);
        bool qOnLeftSide = checkExists(root->left, q);
        
        if(pOnLeftSide != qOnLeftSide)
            return root;
        
        if(pOnLeftSide){
            return lowestCommonAncestor(root->left, p, q);
        }
        else{
            return lowestCommonAncestor(root->right, p, q);
        }
    }
};
```

