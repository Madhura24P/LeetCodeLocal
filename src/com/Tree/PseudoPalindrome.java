package com.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Tree.BalancedTree.TreeNode;

public class PseudoPalindrome {
	
	private int count=0;
	
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
	
	 public int pseudoPalindromicPaths (TreeNode root) {
		 
		 if(root==null)
		 {
			 return 0;
		 }
		 
		 helper(root,new HashSet<>());
		 
		 return count;
	        
	    }
	 
	 private void helper(TreeNode root,Set<Integer> nodes)
	 {
		 
		 if(root==null)
		 {
			 return;
		 }
		 
		 if(nodes.contains(root.val))
		 {
			 nodes.remove(root.val);
			 
		 }else
		 {
			 nodes.add(root.val);
		 }
		 
		 if(root.left==null && root.right==null)
		 {
			 // if even legnth palindrome all elements occurance is even hence size will 0
			 //if odd length palindrome only 1 element occuurance =is odd hence siz e1
			 if(nodes.size()==0||nodes.size()==1)
			 {
				count++; 
			 }
		 }
		 
		 helper(root.left,new HashSet<>(nodes));
		 helper(root.right,new HashSet<>(nodes));
		 
		 
		 
	 }

}
