
package com.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTree {
	
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
	
	 public List<List<Integer>> levelOrder(TreeNode root) {
		 
		 List<List<Integer>> res=new ArrayList<>();
		 Queue<TreeNode> queue=new LinkedList<>();
		 queue.add(root);
		 while(!queue.isEmpty())
		 {
			 List<Integer> currLevel=new ArrayList<>();
			 int Qsize=queue.size();
			 for(int i=0;i<Qsize;i++)
			 {
				 TreeNode curr=queue.poll();
				 currLevel.add(curr.val);
				 if(curr.left!=null)
				 {
					 queue.add(curr.left);
				 }
				 if(curr.right!=null)
				 {
					 queue.add(curr.right);
				 }
			 }
			 
			 res.add(currLevel);
		 }
		 
		 
		 
		 
	     return res;   
	    }

}
