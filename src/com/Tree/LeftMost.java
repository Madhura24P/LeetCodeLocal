package com.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class LeftMost {
	
	List<Integer> leftlist=new LinkedList<>();
	List<Integer> rightList=new LinkedList<>();
	
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
	
public int findBottomLeftValue(TreeNode root) {
	if(root==null)
	{
		return 0;
	}
	
	if(root.left!=null)
	{
		leftlist.add(root.left.val);
		findBottomLeftValue(root.left);
		
	}
	
	if(root.right!=null)
	{
		findBottomLeftValue(root.right);
		
	}
	
	if(!leftlist.isEmpty())
    {
        return leftlist.getLast();
    }
	return root.val;        
    }


public int findBottomLeftValueOpt(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    TreeNode leftmost = null;

    while (!q.isEmpty()) {
        leftmost = q.poll();

        if (leftmost.right != null) {
            q.offer(leftmost.right);
        }
        if (leftmost.left != null) {
            q.offer(leftmost.left);
        }
    }

    return leftmost.val;
}

}
