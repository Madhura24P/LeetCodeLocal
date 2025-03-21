package com.datastruc;

public class MyQueue {
	
	private int[] queueArr;
	private int size;
	private int rear;
	private int front;
	private int number;
	
	public MyQueue(int size)
	{
		this.size=size;
		queueArr=new int[this.size];
		rear=0;
		front=0;
	}
	
	public void offer(int val)
	{
		if(isFull())
		{
			System.out.println("Exception");
		}
		if(rear==size)
			rear=0;
			queueArr[rear++]=val;
			number++;

	}
	
	public int poll()
	{
		if(isEmpty())
		{
			System.out.println("Exception");
		}
		
		int delVal=queueArr[front++];
		if(front==size)
		{
			front=0;
		}
		
		number--;
		return delVal;
	}
	
	public boolean isFull()
	{
		return number==size;
	}

	public boolean isEmpty()
	{
		return number==0;
	}
	

}
