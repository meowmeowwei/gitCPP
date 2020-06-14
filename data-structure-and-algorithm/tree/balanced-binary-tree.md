---
description: 'https://www.interviewcake.com/question/cpp/balanced-binary-tree'
---

# balanced-binary-tree

**Write a function to see if a binary tree ↴ is** _**"superbalanced"**_ **\(a new tree property we just made up\).**

A tree is "superbalanced" if the difference between the depths of any two leaf nodes ↴ is no greater than one.

{% embed url="https://leetcode.com/problems/balanced-binary-tree/" %}

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
    
    
    int getHeight(TreeNode * node){
        if(!node){
            return 0;
        }
        
        return  1+ max(getHeight(node->left), getHeight(node->right));
        
    }
    
    
    bool isBalanced(TreeNode* root) {
        if(!root)
            return true;
        
        if (abs(getHeight(root->left) -getHeight(root->right))<=1){
                if(isBalanced(root->left) && isBalanced(root->right))
                    return true;
        }
        return false;
    }
};

```

