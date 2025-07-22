package com.stack;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Stack<int[]> st = new Stack();

	public int next(int price) {
		  
		 
		 int cnt=1;
		  if(st.isEmpty())
		  {
			  int[] arr= {price,st.size()+1};
			  st.push(arr);
			  return cnt;
		  }
		 
		  while(!st.isEmpty() && st.peek()[0]<=price)
		  {
			  cnt=cnt+st.peek()[1];
			  st.pop();
			  
		  }
		  
		  if(st.isEmpty() || st.peek()[0]>price)
		  {
			  int[] arrN= {price,cnt};
					  st.push(arrN);

				  return st.peek()[1];
		  }
			 
		  
		  return cnt;
		 		  
		  
	        
	    }

}
