package com.Tree;

import com.Tree.SameTree.TreeNode;

public class SubTree {
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
		TreeNode l1=new TreeNode(1);
		//TreeNode r1=new TreeNode(5);
		//TreeNode l2=new TreeNode(1);
		//TreeNode r2=new TreeNode(2);
		root.left=l1;
		l1.left=null;
		//l1.right=r2;
		//root.right=r1;
		//r1.left=r2;
		
		TreeNode subRoot=new TreeNode(1);
		TreeNode sl1=new TreeNode(1);
		TreeNode sr1=new TreeNode(2);
		
		subRoot.left=null;
		subRoot.right=null;
		
		isSubTree(root,subRoot);

	}
	
public static boolean isSubTree(TreeNode p, TreeNode q) {
	boolean flag=false;
	flag=helper(p,q);
	System.out.println(flag);
	
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
		
			flag=helper_2(r.left,s.left) && helper_2(r.right,s.right);
			//return flag;
				
	}
	if(flag==false)
	flag=helper(r.left,s) || helper(r.right,s);
		
	
	return flag;
}

private static boolean helper_2(TreeNode r,TreeNode s)
{
	boolean flag=false;
	if(r==null && s==null)
	{
		return true;
	}
	if((r==null && s!=null) || (r!=null && s==null)|| r.val!=s.val)
	{
		return false;
	}
	
	if(r.val==s.val)
	{
		flag=helper_2(r.left,s.left) && helper_2(r.right,s.right);
		return flag;
	}
	
	return flag;
	
}

}
