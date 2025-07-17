package com.Tree;

import com.Tree.BalancedTree.TreeNode;

public class SearchBST {
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
	
   public TreeNode searchBST(TreeNode root, int val) {
	   
	   if(root==null)
	   {
		   return null;
	   }
       
	   while(root!=null && root.val!=val)
	   {
		   root=val<root.val?root.left:root.right;
	   }
	   
	   return root;
	   
    }

}
