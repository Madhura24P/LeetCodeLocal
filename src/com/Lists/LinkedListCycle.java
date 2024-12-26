package com.Lists;

import com.Lists.ReverList.ListNode;

public class LinkedListCycle {
	
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
		head.next=n1;
		hasCycle(head);

	}
	
public static boolean hasCycle(ListNode head) {
	
	boolean flag=false;
	if(head==null)
    {
        return false;
    }
	ListNode slow=head;
	ListNode fast=head.next;

	while(fast!=null)
	{
		if(fast==slow)
		{
			flag=true;
			break;
		}
		slow=slow.next;
		if(fast.next!=null)
		fast=fast.next.next;
		else
		{
			fast=null;
		}
	}
        
	System.out.println(flag);
	return flag;
    }

}
