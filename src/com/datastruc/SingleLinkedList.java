package com.datastruc;

public class SingleLinkedList {
	
	private ListNode node;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static void main(String args[])
	{
		ListNode head=createList();
		System.out.println("***************************");
		printList(head);
		System.out.println("***************************");
		System.out.println("Length:"+listLength(head));
System.out.println("***************************");

		head=insertStart(head,12);
		printList(head);
		System.out.println("***************************");

		head=insertEnd(head, 4);
		printList(head);
		System.out.println("***************************");
		head=insertAt(head, 9, 4);
		printList(head);
		System.out.println("***************************");
		head=deleteFirst(head);
		printList(head);
		System.out.println("***************************"); 


		
	}
	
	public static ListNode createList()
	{
		
		ListNode head=new ListNode(10);
		ListNode scnd=new ListNode(8);
		ListNode thrd=new ListNode(6);
		head.next=scnd;
		scnd.next=thrd; 
		
		return head;
		
	}
	
	public static void printList(ListNode head)
	{
		ListNode current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public static int listLength(ListNode head)
	{
		int count=0;
		ListNode curr=head;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public static ListNode insertStart(ListNode head, int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public static ListNode insertEnd(ListNode head,int value )
	{
		if(head==null)
		{
			head=new ListNode(value);
			return head;
		}
		
		ListNode curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new ListNode(value);
		return head;
		
	}
	
	public static ListNode insertAt(ListNode head,int value,int pos)
	{
		ListNode newNode=new ListNode(value);
		if(pos==1 && head!=null)
		{
			newNode.next=head;
			head=newNode;
		}else
		{
			ListNode prev=head;
			int count=1;
			while(count<pos-1)
			{
				prev=prev.next;
				count++;
				
			}
			
			ListNode curr=prev.next;
			newNode.next=curr;
			prev.next=newNode;
		}
		
		
		
		
		return head;
	}
	
	
	public static ListNode deleteFirst(ListNode head)
	{
		if(head==null)
		{
			return null;
		}else
		{
			ListNode temp=head;
			head=head.next;
			temp.next=null;
		}
		
		return head;
	}
	
	//++==public 

}
