package com.Tree;

import com.Tree.DiameterTree.TreeNode;

public class BalancedTree {
	//A height-balanced binary tree is defined as a binary tree where the difference in 
	//height between the left and right subtrees of any node is at most 19
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
	
	public static  boolean isBalanced(TreeNode root) {
        // If the tree is empty, we can say it’s balanced...
      if (root == null)  return true;
      // Height Function will return -1, when it’s an unbalanced tree...
		if (Height(root) == -1)  return false;
		return true;
      
  }

  public static int Height(TreeNode root) {
      // Base case...
		if (root == null)  return 0;
      // Height of left subtree...
		int leftHeight = Height(root.left);
      // Height of height subtree...
		int rightHight = Height(root.right);
      // In case of left subtree or right subtree unbalanced, return -1...
		if (leftHeight == -1 || rightHight == -1)  return -1;
      // If their heights differ by more than ‘1’, return -1...
      if (Math.abs(leftHeight - rightHight) > 1)  return -1;
      // Otherwise, return the height of this subtree as max(leftHeight, rightHight) + 1...
		return Math.max(leftHeight, rightHight) + 1;
  }

}