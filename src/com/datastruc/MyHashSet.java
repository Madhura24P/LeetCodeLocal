6package com.datastruc;



public class MyHashSet {
	static class Node{
		
		int key;
		Node next;
		
		Node(int k)
		{
			this.key=k;
			this.next=null;
		}
		
	}
	
	private Node[] set;

	 public MyHashSet() {
		 set=new Node[1000];
		 for(int i=0;i<1000;i++)
		 {
			 set[i]=new Node(-1);
			 
		 }
		 	        
	    }
	    
	    public void add(int key) {
	        
	    	int h=hash(key);
	    	Node cur=set[h];
	    	while(cur.next!=null)
	    	{
	    	if( cur.next.key==key)
	    	{
	    		return;
	    	}
	    	
	    	cur=cur.next;
	    	}
	    	
	    	cur.next=new Node(key);
	    	
	    	
	    	
	    	
	    }
	    
	    public void remove(int key) {
	        int hash=hash(key);
	        Node cur=set[hash];
	        
	        while(cur.next!=null)
	        {
	        	if(cur.next.key==key)
	        	{
	        		cur.next=cur.next.next;
	        		return;
	        	}
	        	cur=cur.next;
	        }
	        
	        
	        
	    }
	    
	    public boolean contains(int key) {
	    	
	    	int h=hash(key);
	    	Node cur=set[h];
	    	
	    	while(cur!=null)
	    	{
	    	if( cur.key==key)
	    	{
	    		return true;
	    	}
	    	cur=cur.next;
	    	}
	        
	    	return false;
	    }
	    
	    private int hash(int k)
	    {
	    	return k%1000;
	    }

}
