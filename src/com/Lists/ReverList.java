package com.Lists;

import com.Lists.MergeSortLists.ListNode;

public class ReverList {
	
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
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		head.next=n1;
		n1.next=n2;
		
		ListNode headRev=reverseList(head);
		
		while(headRev!=null)
		{
			System.out.print(headRev.val+"->");
			headRev=headRev.next;
			
		}

	}
	
public static ListNode reverseList(ListNode head) {
	
	//ListNode revHead=new ListNode(0);
	ListNode prev=null;
	ListNode next=null;
	ListNode temp=head;
	//1->2->3
	
	while(head!=null)
	{
		next=head.next;//3
		head.next=prev;//3->2->1->null
		prev=head;//2
		head=next;//2
	}
	
	
	
	return prev;
        
    }

}
