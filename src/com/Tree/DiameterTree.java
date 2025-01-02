package com.Tree;

import com.Tree.SameTree.TreeNode;

public class DiameterTree {
	
static 	int max=Integer.MIN_VALUE;
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
		TreeNode root=new TreeNode(2);
		TreeNode l1=new TreeNode(3);
		//TreeNode r1=new TreeNode(7);
		TreeNode l2=new TreeNode(1);
		//TreeNode r2=new TreeNode(2);
		root.left=l1;
		l1.left=l2;
		//l1.right=r2;
		root.right=null;
		//r1.left=r2;
		
		System.out.println(diameterOfBinaryTree(root));

	}
	
public static int diameterOfBinaryTree(TreeNode root) {
	int len=0;
	
	len=helper(root);
	return len;
        
    }

private static int helper(TreeNode r)
{
	int left=0 ,right=0;
	
	if(r.left!=null)
	{
		left=helper(r.left);
	}
	
	if(r.right!=null)
	{
		right=helper(r.right);
	}
	
	max=Math.max(max, +right+left);
	return Math.max(left, right)+1;
}

}
