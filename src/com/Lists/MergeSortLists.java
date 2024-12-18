package com.Lists;

import com.TwoPointer.Easy.RemoveDupSortedList.ListNode;

public class MergeSortLists {
	
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
	
	 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		 
		 ListNode res=new ListNode(0);
		 ListNode temp=res;
		 
		 while(list1!=null && list2!=null)
		 {
			 if(list1.val<list2.val)
			 {
				res.next=list1;
				list1=list1.next;
			 }else
			 {
				 res.next=list2;
				 list2=list2.next;
			 }
			 res=res.next;
			 
		 }
		 if(list1!=null)
		 {
			 res.next=list1;
		 }
		 if (list2!=null)
		 {
			 res.next=list2;
		 }
		 return temp.next;
	        
	    }

}
