package com.Tree;

import com.Tree.MaxDepthBinaryTree.TreeNode;

public class SymmetricTree {
	
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
	
public boolean isSymmetric(TreeNode root) {
	 boolean flag=false;
	    if(root==null)
	    {
	    	return false;
	    }
	    
	    
	    flag=symm(root.left,root.right);
	    
	    return flag;
	
	
    }

private boolean symm(TreeNode rootA,TreeNode rootB)
{
	boolean flag=false;
	if(rootA==null && rootB==null)
	{
		return true;
	}
	if(rootA==null ||rootB==null)
	{
		return false;
	}
	
	flag= rootA.val==rootB.val && symm(rootA.left,rootB.right) && symm(rootA.right,rootB.left); 
	
	
	return flag;
}

}
