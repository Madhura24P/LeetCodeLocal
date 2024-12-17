package com.TwoPointer.Easy;


public class RemoveDupSortedList {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		ListNode h1=new ListNode(1);
		ListNode h2=new ListNode(2);
		ListNode h3=new ListNode(3);
		ListNode h4=new ListNode(3);
		head.next=h1;
		h1.next=h2;
		h2.next=h3;
		h3.next=h4;
		h4.next=null;
		head=deleteDuplicates(head);
		
		while(head!=null)
		{
			System.out.print(head.val);
			head=head.next;
		}
		

	}
	
	 public static ListNode deleteDuplicates(ListNode head) {
		 
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
