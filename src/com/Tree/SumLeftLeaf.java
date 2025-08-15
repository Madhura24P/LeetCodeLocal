package com.Tree;

public class SumLeftLeaf {
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
	
	 public int sumOfLeftLeaves(TreeNode root) {
		 int sum=0;
		 sum=helper(root,0);
		 return sum;
	        
	    }
	 
	 public int helper(TreeNode root,int sum)
	 {
		 if(root==null)
		 {
			 return sum;
		 }
		 
		 if(root.left!=null && root.left.left==null && root.left.right==null)
		 {
			 sum=helper(root.left,sum+root.left.val);
		 }else
		 {
			 sum=helper(root.left,sum);
		 }
		 
		 
		 
		 if(root.right!=null)
		 {
			 sum=helper(root.right, sum);
		 }
		 
		 return sum;
	 }

}
