package com.Tree;

import com.Tree.InvertTree.TreeNode;

public class LowestCommonAncestorBinarySearchT {
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
	
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	 while (root != null) {
         if (p.val > root.val && q.val > root.val) {
             root = root.right;
         } else if (p.val < root.val && q.val < root.val) {
             root = root.left;
         } else {
             return root;
         }
     }
     return null;
	
    }

}
