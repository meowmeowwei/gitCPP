# find second largest in BST

need to know how to find the largest first 



```cpp
int findLargest(const BinaryTreeNode * rootNode){
    if(rootNode->right_){
        return findLargest(rootNode ->right_);
    }
    
    return rootNode->value_;
}

int findSecondLargest( BinaryTreeNode* rootNode)
{
    
    if (!rootNode || (!rootNode->left_ && !rootNode->right_)) {
        throw invalid_argument("Tree must have at least 2 nodes");
    }
    
    
    if(rootNode->left_ && !rootNode->right_){
        return findLargest(rootNode->left_);
    }
    
    if(rootNode->right_ && !rootNode->right_->left_ && !rootNode->right_->right_){
        return rootNode->value_;
    }

    return findSecondLargest(rootNode->right_);
}



```

