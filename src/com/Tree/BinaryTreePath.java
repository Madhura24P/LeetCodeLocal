package com.Tree;

import java.util.ArrayList;
import java.util.List;

import com.Tree.PathSum.TreeNode;

public class BinaryTreePath {
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
	
	List<String> l=new ArrayList<>();
	
	 public List<String> binaryTreePaths(TreeNode root) {
		 
		 Path(root,"");
		 
		 return l;
		 
	        
	    }
	 
	 private void Path(TreeNode r,String s)
	 {
		 s=s+r.val;
		
		 if(r.left==null && r.right==null)
		 {
			
			 l.add(s);
			 return;
			 
		 }
		 
		 if(r.left!=null)
		 {
			 String sLeft=s+"->";
			 Path(r.left,sLeft);
		 }
		 
		 if(r.right!=null)
		 {
			 String sRight=s+"->";
			 Path(r.right,sRight);
		 }
		 
	 }

}
