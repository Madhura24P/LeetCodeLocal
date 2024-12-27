package com.stack;

import java.util.Stack;

public class ImplementQusingStack {
	
	private Stack<Integer> in_stack;
	private Stack<Integer> out_stack;
	 
	
	public  ImplementQusingStack()
    {
		in_stack=new Stack<>();
		out_stack=new Stack<>();
		
	}
	
	private void transfer()
	{
		while(!in_stack.isEmpty())
		{
			out_stack.push(in_stack.pop());
		}
	}
	
	public void push(int x)
	{
		in_stack.push(x);
	}
	
	public int pop()
	{
		if(out_stack.isEmpty())
		{
			transfer();
		}
		return out_stack.pop();
		
	}
	
	public int peek()
	{
		if(out_stack.isEmpty())
		{
			transfer();
		}
		return out_stack.peek();
	}
	
	public boolean empty()
	{
		return in_stack.isEmpty() && out_stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
