package com.Tree;

import com.Tree.MaxDepthBinaryTree.TreeNode;

public class InvertTree {
	public static class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static TreeNode invertTree(TreeNode root) {
       
	if(root==null)
	{
		return null;
	}
	//helper(root.left,root.right,root);
	
	TreeNode temp=root.left;
	root.left=root.right;
	root.right=temp;
	invertTree(root.left);
	invertTree(root.right);
	
	return root;
    }

public static void helper(TreeNode left,TreeNode right,TreeNode root)
{
	if(left==null && right ==null)
	{
		return ;
	}
	else if(left==null && right !=null)
	{
		root.left=right;
		root.right=null;
        return;
	}
	else if(left!=null && right ==null)
	{
		root.right=left;
		root.left=null;
        return;
	}
	
	helper(left.left,left.right,left);
	helper(right.left,right.right,right);
	//int tempVal=left.val;
	//left.val=right.val;
	//right.val=tempVal;

    TreeNode temp=root.right;
    root.right=root.left;
    root.left=temp;
}

}
