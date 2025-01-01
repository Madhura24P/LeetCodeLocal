package com.Tree;

import com.Tree.InvertTree.TreeNode;

public class SameTree {
	
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
	
public static boolean isSameTree(TreeNode p, TreeNode q) {
	boolean flag=false;
	flag=helper(p,q);
	
	return flag;
        
    }

private static boolean helper(TreeNode r,TreeNode s)
{
	boolean flag =false;
	if(r==null && s==null)
	{
		return true;
	}
	if((r==null && s!=null) || (r!=null && s==null))
	{
		return false;
	}
	if(r.val==s.val)
	{
		flag=helper(r.left,s.left) && helper(r.right,s.right);

	}
		
	
	return flag;
}

}
