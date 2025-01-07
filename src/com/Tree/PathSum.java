package com.Tree;

import com.Tree.BinaryTreeInorder.TreeNode;

public class PathSum {
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
		TreeNode root=new TreeNode(1);
		TreeNode l1=new TreeNode(2);
		TreeNode r1=new TreeNode(2);
		root.left=l1;
		root.right=r1;
		TreeNode l2=new TreeNode(2);
		TreeNode r2=new TreeNode(3);
		TreeNode ll2=new TreeNode(1);
		TreeNode lr2=new TreeNode(5);
		l1.left=l2;
		r1.right=r2;
		l2.left=ll2;
		l2.right=lr2;
		hasPathSum(root, 10);

	}
	
public static boolean hasPathSum(TreeNode root, int targetSum) {
	

	if(root==null)
	{
		return false;
	}
	
	if(root.right==null && root.left==null)
	{
		return targetSum==root.val;
	}
	
	boolean Leftsum=hasPathSum(root.left, targetSum-root.val);
	boolean Rightsum=hasPathSum(root.right, targetSum-root.val);
	
	return Leftsum || Rightsum;


}

}