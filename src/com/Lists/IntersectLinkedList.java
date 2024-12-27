package com.Lists;

import com.Lists.DelDuplicates.ListNode;

public class IntersectLinkedList {
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headA=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		headA.next=n1;
		n1.next=n2;

		
		ListNode headB=new ListNode(0);
		ListNode nB1=new ListNode(3);
		//ListNode nB2=new ListNode(3);
		headB.next=nB1;
		nB1.next=n1;

     getIntersectionNode(headA, headB);
	}
	
public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
	
    }


}
