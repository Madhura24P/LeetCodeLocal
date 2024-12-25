package com.fastSlow;

public class MiddleList {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	public static void main(String[] args) {
		
	}
	
	 public ListNode middleNode(ListNode head) {
	        ListNode slow = head, fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }

}
