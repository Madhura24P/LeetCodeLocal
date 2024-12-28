package com.Tree;

import com.Tree.BinaryTreeInorder.TreeNode;

public class MaxDepthBinaryTree {
	
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
	
public int maxDepth(TreeNode root) {
	if(root==null)
	{
		return 0;
	}
	
	int depth=depth(root,1);
	
	return depth;
        
    }

private int depth(TreeNode root,int depth)
{
	if(root==null)
	{
		return depth;
	}
	
	//depth=depth+1;
	if(root.left!=null||root.right!=null)
	{
		depth=depth+1;
	depth=Math.max(depth(root.left,depth),depth(root.right,depth) );
	}
	
	return depth;
	
}

}
