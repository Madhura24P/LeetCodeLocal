package com.Lists;



public class InsertGCD {
	
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
	
public ListNode insertGreatestCommonDivisors(ListNode head) {
	

    ListNode defaultHead=head;

    while(head!=null && head.next!=null)
{
	int val1=head.val;
	int val2=head.next.val;
	int gcd=gcd(val1, val2);
	ListNode gcdNode=new ListNode(gcd);
	ListNode temp=head.next;
	head.next=gcdNode;
	gcdNode.next=temp;
	head=gcdNode.next;
	
	
}
   return defaultHead;
        
    }


public int gcd(int a,int b)
{
	
	int res=Math.min(a, b);
	while(res>0)
	{
		if(a%res==0 && b%res==0)
		{
			break;
		}
		
		res--;
	}
	
	return res;
}


//LCM of a,b =is a*b/gcd(a,b)
//HCF==gcd.


}
