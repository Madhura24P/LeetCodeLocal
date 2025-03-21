package com.datastruc;

public class MyStack {
	private int size;
	private int[] stkArr;
	private int top;
	public MyStack(int size) {
		super();
		this.size = size;
		stkArr=new int[size];
		top=-1;
	}
	
	public void push(int value) throws Exception
	{
		if(isFull()) {
			throw new Exception("Stack is fiull");
		}
		
		stkArr[++top]=value;
	}
	
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stc%k is empty");
		}
		
		return stkArr[top--];
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}

	public boolean isEmpty()
	{
		return top==-1;
	}
	
	
}
