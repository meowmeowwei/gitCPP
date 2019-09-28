///////////////////////////////////////////////////
/////  /////  LogName: u0706987/////  FullName: Cao Hoang Dang
/////  CreationDate: 2008-10-22 18:04:22
/////  
///////////////////////////////////////////////////



import java.util.*;

public class myBST {
	//your implementation here
	
	public static void main(String [] args) {
		//your code here
        Scanner sc=new Scanner(System.in);
        BinarySearchTree BST= new BinarySearchTree();



        //input numbers of nodes
        int nodeNo= sc.nextInt();
        
        //input values into BST
        for(int i=0;i<nodeNo;i++){



	}

    
}

class TreeNode {
    int item;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int obj, TreeNode left, TreeNode right){
        item= obj;
        leftNode = left;
        rightnode= right;
    }

    public TreeNode getLeft(TreeNode T){
        return T.leftNode;
    }

    public TreeNode getRight(TreeNode T){
        return T.rightNode;
    }

    public int getItem(TreeNode T){
        return T.item;
    }

    public void setNode(int x){
        item=x;
    }



    //public void setLeft(int x,TreeNode T){


}

class BinarySearchTree{
    TreeNode root;
    
    public BinarySearchTree(){
        root = new TreeNode(int -1, null, null);
    }

    public void setRoot(int x){
        root.setNode(x);
}




}









