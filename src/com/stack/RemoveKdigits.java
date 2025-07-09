package com.stack;

import java.util.Stack;

public class RemoveKdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="1432219";
		removeKdigits(num, 3);
		

	}
	
	 public static String removeKdigits(String num, int k) {
		 
		 if(num.length()==1 && Integer.parseInt(num)<0)
		 {
			 return "0";
		 }
		 Stack<Integer> st=new Stack();
		 int count=0;
		 
		 for(int i=0;i<num.length();i++)
		 {
			 int n=Integer.parseInt(Character.toString(num.charAt(i)));
			 if(!st.isEmpty() && n<st.peek() && count<k)
			 {
				 st.pop();
				 st.push(n);
				 count++;
			 }else
			 {
				 st.push(n);
			 }
		 }
	     
		 StringBuilder res=new StringBuilder();
		 while(!st.isEmpty())
		 {
			 
			 res.append(st.pop());
		 }
		 
		 System.out.println(res);
		 Integer res_num=Integer.parseInt(res.reverse().toString());
		 
		 System.out.println(res_num);
		 return res_num.toString();
	    }

	 
	    public String removeKdigitsOpt(String num, int k) {
	        int len = num.length();
	        //corner case
	        if(k==len)        
	            return "0";
	            
	        Stack<Character> stack = new Stack<>();
	        int i =0;
	        while(i<num.length()){
	            //whenever meet a digit which is less than the previous digit, discard the previous one
	            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
	                stack.pop();
	                k--;
	            }
	            stack.push(num.charAt(i));
	            i++;
	        }
	        
	        // corner case like "1111"
	        while(k>0){
	            stack.pop();
	            k--;            
	        }
	        
	        //construct the number from the stack
	        StringBuilder sb = new StringBuilder();
	        while(!stack.isEmpty())
	            sb.append(stack.pop());
	        sb.reverse();
	        
	        //remove all the 0 at the head
	        while(sb.length()>1 && sb.charAt(0)=='0')
	            sb.deleteCharAt(0);
	        return sb.toString();
	    }

}
