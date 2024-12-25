package com.Lists;

import com.Lists.MergeSortLists.ListNode;

public class RemoveValList {
	
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
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		head.next=n1;
		n1.next=n2;
		
		ListNode headN=removeElements(head, 1);
		while(headN!=null)
		{
			System.out.print(headN.val+"->");
			headN=headN.next;
		}

	}
	
public static ListNode removeElements(ListNode head, int val) {
	
	//ListNode temp=new ListNode(0);
	//temp.next=head;
	ListNode tempNode=head;
	ListNode prev=new ListNode(0);
	ListNode prevNext=prev;
	
	while(tempNode!=null)
	{
		while(tempNode!=null && tempNode.val==val)
		{
			tempNode=tempNode.next;
			//prev.next=tempNode;8
			//continue;
		}
		prev.next=tempNode;
		prev=prev.next;
		if(tempNode!=null)
		tempNode=tempNode.next;
	}
     
	return prevNext.next;
    }
}
