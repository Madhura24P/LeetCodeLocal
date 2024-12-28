package com.Tree;

import java.util.*;

public class BinaryTreePreOrder {
	
	//static List<Integer> list=new ArrayList<>();
	
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
	
	 
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        preorder(root, res);
        return res;
        
    }

    private void preorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }

        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    } 

}
