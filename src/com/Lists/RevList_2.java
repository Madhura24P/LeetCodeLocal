package com.Lists;

import com.Lists.AddTwoNums_2.ListNode;

public class RevList_2 {
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public ListNode reverseBetween(ListNode head, int left, int right) {
	
	 if (head == null || left == right) {
         return head;
     }
	 
	 ListNode dummy = new ListNode(0);
     dummy.next = head;
     ListNode prev = dummy;

     for (int i = 0; i < left - 1; i++) {
         prev = prev.next;
     }

     ListNode cur = prev.next;
     
     for (int i = 0; i < right - left; i++) {
         ListNode temp = cur.next;
         cur.next = temp.next;
         temp.next = prev.next;
         prev.next = temp;
     }

     return dummy.next;
	
	
        
    }

}
