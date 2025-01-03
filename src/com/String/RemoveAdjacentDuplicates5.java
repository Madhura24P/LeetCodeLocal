package com.String;

import java.util.Stack;

public class RemoveAdjacentDuplicates5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbaca";
		removeDuplicates(s);

	}
	
public static String removeDuplicates(String s) {
	
	int aPt=0;
	int bPt=1;
	while(bPt<s.length())
	{
		if(s.charAt(aPt)==s.charAt(bPt))
		{
			s=s.substring(0,aPt)+ s.substring(bPt+1);
			aPt=0;
			bPt=1;
			
		}else
		{
			aPt++;
			bPt++;
		}
		
	}
	
	System.out.println(s);
	
	return s;
        
    }

public String removeDuplicatesOpt(String s) {
    // Create an empty stack.
        Stack <Character> stack = new Stack<>();

        // Iterare over the string
        for (char c: s.toCharArray()) {
            // If stack has at least one character and
            // stack's top character is same as the string's character.
            if (!stack.isEmpty() && stack.peek() == c) {
                // Pop a character from the stack.
                stack.pop();
            } else {
                // Otherwise, push that character onto the stack.
                stack.push(c);
            }
        }

        // Initialize a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();
        // Pop all characters from the stack and append them to the 
        // StringBuilder
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Since the characters were added in reverse order, 
        // reverse the StringBuilder to get the final result
        return result.reverse().toString();
    }

}
