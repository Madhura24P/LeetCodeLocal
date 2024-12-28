package com.Tree;

import java.util.ArrayList;
import java.util.List;

import com.Tree.BinaryTreePreOrder.TreeNode;

public class BinaryTreeInorder {
	
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
	
public List<Integer> inorderTraversal(TreeNode root) {
	
	List<Integer> res = new ArrayList<>();

    inorder(root, res);
    return res;
        
    }


private void inorder(TreeNode node, List<Integer> res) {
    if (node == null) {
        return;
    }

    inorder(node.left, res);
    res.add(node.val);
    inorder(node.right, res);
    

} 

}
