# Check BST

```cpp


#include <iostream>
#include <memory>

// C++11 lest unit testing framework
#include "lest.hpp"

using namespace std;

class BinaryTreeNode
{
public:
    int value_;
    BinaryTreeNode* left_;
    BinaryTreeNode* right_;

    BinaryTreeNode(int value) :
        value_(value),
        left_(nullptr),
        right_(nullptr)
    {
    }

    ~BinaryTreeNode()
    {
        delete left_;
        delete right_;
    }

    BinaryTreeNode* insertLeft(int value)
    {
        this->left_ = new BinaryTreeNode(value);
        return this->left_;
    }

    BinaryTreeNode* insertRight(int value)
    {
        this->right_ = new BinaryTreeNode(value);
        return this->right_;
    }
};


bool checkBST( BinaryTreeNode * node, int * min, int * max){
    if(!node)
        return true;
        
    if((min && node->value_ < *min) ||(max && node->value_ > *max))
        return false;
    
    if(!checkBST(node->left_, min, &(node->value_)) ||!checkBST(node->right_, &(node->value_), max)){
        return false;
    }
    
    return true;
}


bool isBinarySearchTree( BinaryTreeNode* root)
{
   if(!root)
    return true;
    
    return checkBST(root, nullptr, nullptr);
  
}


```

