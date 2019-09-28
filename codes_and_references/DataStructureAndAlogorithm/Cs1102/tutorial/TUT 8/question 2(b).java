TreeNode constructTree(int[] inOrder, int[] preOrder, int n) {
  if(n == 1)
    return new TreeNode(inOrder[0]);
  
  int element = preOrder[0];            // int element = postOrder[n-1]
  TreeNode root = new TreeNode(element);
  
  for (int i=0; i<n; i++)
    if (inOrder[i] == preOrder[0]) {    // if(inOrder[i] == postOrder[n-1]
    inorderIndex = i;
    break;
  }                                                                 // for postOrder and inOrder
  
  int[] preorderLeft = copyArray(preOrder, 1, inorderIndex);        // int[]postOrderLeft = copyArray(postOrder,0,inorderIndex-1);
  
  int[] preorderRight = copyArray(preOrder, inorderIndex+1, n-1);   // int[]postOrderRight = copyArray(postOrder,inorderIndex, n-2)
  int[] inorderLeft = copyArray(inOrder, 0, inorderIndex-1);        // int[] inOrderLeft = copyArray(inOrder, 0, inorderIndex-1); 
  int[] inorderRight = copyArray(inOrder, inorderIndex+1, n-1);     // int[] inorderRight = copyArray(inOrder, inorderIndex+1, n-1); 
  
  root.left = constructTree(inorderLeft, preorderLeft, inorderIndex);
  root.right = constructTree(inorderRight, preorderRight, n - (inorderIndex+1)); 
  
  return root;
}

int [] copyArray(int[] arr, int start, int end)
{
  int[] result = new int[end-start+1];
  for(int i=0; i<end-start+1; i++)
    result[i] = arr[start++];
  return result;
}