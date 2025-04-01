package com.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvalRPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int evalRPN(String[] tokens) {
	Stack<Integer> stack=new Stack<>();
	int result=0;
	
	for(String s:tokens)
	{
		if(isNumber(s))
		{
			
			stack.push(Integer.valueOf(s));
			
		}else
		{
			int num1=stack.pop();
			int num2=stack.pop();

			if(s.equals("+"))
			{
					result=num1+num2;			
			}
			else if(s.equals("-"))
			{
				result=num2-num1;
				
			}else if(s.equals("*"))
			{
				result=num1*num2;
			}else if(s.equals("/"))
			{
				result=num2/num1;
				
			}
			
			stack.push(result);
		}
		
			
	}
	return stack.pop();
	
    }

private boolean isNumber(String s)
{
	List<String> op=Arrays.asList("+","-","/","*");
	if(op.contains(s))
	{
		return false;
	}else
		return true;
	
	
}

}
