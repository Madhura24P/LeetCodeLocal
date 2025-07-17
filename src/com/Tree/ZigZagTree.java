package com.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.Tree.SameTree.TreeNode;

public class ZigZagTree {
	
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
	
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res=new ArrayList<>();
		if(root==null)
		{
			return res;
		}
		
		Deque<TreeNode> que=new LinkedList<TreeNode>();
		boolean leftToRight=true;
		que.offer(root);
		
		while(!que.isEmpty())
		{
			int size=que.size();
			List<Integer> subList=new ArrayList<Integer>(size);
			for(int i=0;i<size;i++)
			{
				/*
				 * TreeNode curr=que.peek(); int index=leftToRight?i:(size-1-i);
				 * subList.add(index, curr.val); que.poll(); if(curr.left!=null) {
				 * que.offer(curr.left); } if(curr.right!=null) { que.offer(curr.right); }
				 */
				
				if(leftToRight)
				{
					TreeNode curr=que.pollFirst();
					subList.add(curr.val);
					if(curr.left!=null)que.addLast(curr.left);
					if(curr.right!=null)que.addLast(curr.right);
				}else {
					TreeNode curr=que.pollLast();
					subList.add(curr.val);
					if(curr.left!=null)que.addFirst(curr.left);
					if(curr.right!=null)que.addFirst(curr.right);
				}
			}
				leftToRight=!leftToRight;
				res.add(subList);
		}
		
		return res;
		
	
		 
	        
	    }

}
