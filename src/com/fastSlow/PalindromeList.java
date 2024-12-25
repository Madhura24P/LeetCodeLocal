package com.fastSlow;

import java.util.Stack;

import com.fastSlow.MiddleList.ListNode;

public class PalindromeList {

	public static void main(String[] args) {
		// TODO Auto-generated meth6od stub855
		ListNode head=new ListNode(1);
		ListNode n1=new ListNode(2);
		ListNode n2=new ListNode(3);
		head.next=n1;
		n1.next=n2;
		
		isPalindrome(head);
		
		

	}
	 public static boolean isPalindrome(ListNode head) {
		 ListNode copyHead=new ListNode(0);
		 copyHead.next=new ListNode(head.val);
		 copyHead=copyHead.next;
		 ListNode temp=copyHead;

		 boolean flag=true;
		 ListNode prev=null;
    	 ListNode next=null;
		 
		 while(head!=null)
		 {
			 next=head.next;//nul666
			 if(next!=null)
			 { copyHead.next=new ListNode(next.val);
			 copyHead=copyHead.next;
		 }
			 head.next=prev;//3->2->1->null
			 prev=head;//3
			 head=next;//null
			 
			 
		 }
		 
		 while(temp!=null && prev!=null)
		 {
			 if(temp.val==prev.val)
			 {
				 temp=temp.next;
				 prev=prev.next;
			 }else
			 {
				 flag=false;
				 break;
			 }
		 }
		 
	        return flag;
	        
	    }
	 
	 public boolean isPalindromeOptimize(ListNode head) {
	        Stack<Integer> stack = new Stack();
	        ListNode curr = head;
	        while(curr != null) {
	            stack.push(curr.val);
	            curr = curr.next;
	        }
	        curr = head;
	        while(curr != null && curr.val == stack.pop()) {
	            curr = curr.next;
	        }
	        return curr == null;
	    }

}
