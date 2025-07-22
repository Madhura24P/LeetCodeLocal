package com.Tree;


public class CompleteTree {
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

	 public int countNodes(TreeNode root) {
		 
		 if(root==null)
		 {
			 return 0;
		 }
		 
		 int leftHt=getLeftHeight(root);
	     int rightHt=getRightHeight(root);
	     
	     if(leftHt==rightHt) return (int) (Math.pow(2, rightHt)-1);
		 
		 return countNodes(root.left)+countNodes(root.right)+1;
	     
	     
	    }
	 
	 public int getLeftHeight(TreeNode root)
	 {
		 int count=1;
		 while(root!=null)
		 {
			 root=root.left;
			 count++;
		 }
		 
		 return count;
		 
	 }
	 
	 public int getRightHeight(TreeNode root)
	 {
		 int count=1;
		 while(root!=null)
		 {
			 root=root.right;
			 count++;
		 }
		 
		 return count;
		 
	 }
	
	
}
