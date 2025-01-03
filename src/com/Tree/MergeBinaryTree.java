package com.Tree;

import com.Tree.BinaryTreeInorder.TreeNode;

public class MergeBinaryTree {
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
	
	 public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	        TreeNode resRoot=new TreeNode();

        	if(root1!=null && root2!=null)
        	{
        	resRoot.val=root1.val+root2.val;
            resRoot.left=mergeTrees(root1.left,root2.left);
            resRoot.right=mergeTrees(root1.right,root2.right);
        	}
        	else if(root1==null && root2!=null)
        	{
        		resRoot.val=root2.val;
                resRoot.left=root2.left;
                resRoot.right=root2.right;
        	}
        	else if(root1!=null && root2==null)
        	{
        		resRoot.val=root1.val;
                resRoot.left=root1.left;
                resRoot.right=root1.right;
        	}
        	else
        	{
        		resRoot=null;
        	}
        
       
       
        return resRoot;
	    }

}
