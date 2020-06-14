---
description: 'https://www.interviewcake.com/question/cpp/bst-checker'
---

# Balanced Search Tree Checker

```cpp
bool checkBST( BinaryTreeNode * node, int * min, int * max){
  
  if(!node){
    return true;
  }
  
  BinaryTreeNode * left = node->left_;
  BinaryTreeNode * right = node->right_;
  
  if(min && node->value_ < *min){
    return false;
  }
   
  if(max && node->value_ > * max){
      return false;
  } 
  
  if(checkBST(left, min, &(node->value_)) && checkBST(right, &(node->value_), max)){
      return true;
  }
  
  return false;
    
}


bool isBinarySearchTree( BinaryTreeNode* root)
{
   if(!root)
    return true;
    
  return checkBST(root, nullptr, nullptr);
  
}


```

