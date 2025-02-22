package com.datastruc;

import java.util.Arrays;

public class MyArrayList {
	
	private Object mylist[];
	private int actSize=0;
	
	public MyArrayList()
	{
		mylist=new Object[10];
	}
	
	public Object get(int index)
	{
		if(index<actSize)
		{
			return mylist[index];
		}else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	
	public void add(Object ob)
	{
		if(mylist.length-actSize<=5)
		{
			increaseSize();
		}else
		{
			mylist[actSize++]=ob;
			
		}
	}
	
	
	public void increaseSize()
	{
		mylist=Arrays.copyOf(mylist, mylist.length*2);
	}
	
	public Object remove(int index)
	{
		if(index<actSize)
		{
			Object obj=mylist[index];
			mylist[index]=null;
			int temp=index;
			while(temp<actSize)
			{
				mylist[temp]=mylist[temp+1];
				mylist[temp+1]=null;
				temp++;
			}
			actSize--;
			return obj;
		}else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	
	public void reverse()
	{
		int  last=actSize;
		int i=0;
		while(i<last)
		{
			Object temp=mylist[last];
			mylist[last]=mylist[i];
			mylist[i]=temp;
			i++;
			last--;
			
		}
	}
	
	public void display()
	{
		
	}
}
