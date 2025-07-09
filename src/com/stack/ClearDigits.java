package com.stack;

import java.util.Stack;

public class ClearDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="cb34";
		System.out.println(clearDigits(s));
		

	}
	
public static String clearDigits(String s) {
	Stack<Character> st=new Stack();
	for(int i=s.length()-1;i>=0;i--)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			st.push(s.charAt(i));
		}else
		{
			if(!st.isEmpty() && Character.isDigit(st.peek()))
			{
				st.pop();
			}else
			{
				st.push(s.charAt(i));
			}
		}
	}
		
		StringBuilder sb=new StringBuilder();
		while(!st.isEmpty())
		{
			sb.append(st.pop());
		}
		
		return sb.toString();
	
        
    }

public String clearDigitsOpt(String s) {
    StringBuilder res = new StringBuilder();

    for (char c : s.toCharArray()) {
        if (Character.isDigit(c)) {
            res.setLength(res.length() - 1);
        } else {
            res.append(c);
        }
    }

    return res.toString();
}

}
