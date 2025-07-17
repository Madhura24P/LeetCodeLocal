package com.Tree;


public class MaxPathSum {

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
	
	 public int maxPathSum(TreeNode root) {
		 if(root==null)
		 {
			 return 0;
		 }
		 
	    int[] max=new int[1];
	    helperPS(root,max);
	    
	    return max[0];
	        
	    }
	 
	 public int helperPS(TreeNode root,int[] max)
	 {
		 if(root==null )
		 {
			 return 0;
		 }
		 
		 int Lsum=Math.max(0,helperPS(root.left,max));
		 int Rsum=Math.max(0,helperPS(root.right,max));
		 max[0]=Math.max(max[0], Lsum+Rsum+root.val);
		 
		 return root.val+Math.max(Lsum, Rsum);
		 
	 }
	 
	 

}
