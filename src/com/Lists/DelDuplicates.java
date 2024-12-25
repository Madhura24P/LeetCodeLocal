package com.Lists;

import com.Lists.ReverList.ListNode;

public class DelDuplicates {
	
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
	
	public ListNode deleteDuplicates(ListNode head) {
        ListNode res_head=head;
		 while(head!=null && head.next!=null )
		 {
			 if(head.val==head.next.val)
			 {
				 
				 head.next=head.next.next;
			 }
			 else
			 {
				 
				 head=head.next;
							 }
			 
			 
		 }
		 
	     return res_head;   

    }

}
