package com.Tree;

import java.util.Stack;

import com.Tree.BalancedTree.TreeNode;

public class KthSmallestElelmentBST {
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
	
	    public int kthSmallest(TreeNode root, int k) {
	        Stack<TreeNode> st = new Stack<>();
	        TreeNode curr = root;
	        while(!st.isEmpty() || curr != null){
	            while(curr != null){
	                st.push(curr);
	                curr = curr.left;
	            }
	            curr = st.pop();
	            k--;
	            if(k == 0){
	                return curr.val;
	            }
	            curr = curr.right;
	        }
	        return -1;
	    }
	}

