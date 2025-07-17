package com.Tree;

import com.Tree.ZigZagTree.TreeNode;

public class LowestCommonAncestorBT {
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
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
		 if(root==null||root==p||root==q)
		 {
			 return root;
		 }
		 
		 TreeNode Lroot=lowestCommonAncestor(root.left, p, q);
		 TreeNode Rroot=lowestCommonAncestor(root.right, p, q);
		 
		 if(Lroot==null)
		 {
			 return Rroot;
		 }else if(Rroot==null)
		 {
			 return Lroot;
		 }else
		 {
		   return root;
		 }
	    }

}
