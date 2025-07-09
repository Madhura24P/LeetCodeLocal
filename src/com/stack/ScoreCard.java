package com.stack;

import java.util.Stack;

public class ScoreCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String action="A";
		
		int score = switch (action) {
	    case "A" -> 100;
	    case "B" -> 80;
	    case "C" -> {
	        int base = 60;
	        yield base + 5;
	    }
	    default -> 0;
	};
}
	
	
	 public int calPoints(String[] operations) {
		 int score=0;
		 Stack<Integer> st=new Stack<>();
		 for(String op:operations)
		 {
			
		     if("+".equals(op))
		     {
		    	 if(!st.isEmpty())
		    	 {
		    	 int temp=st.pop()+st.pop();
		    	 st.push(temp);
		    	 }
		     
		     }else if("C".equals(op))
		     {
		    	 st.pop();
		     }else if("D".equals(op))
		     {
		    	 int temp=st.pop();
		    	 st.push(temp*temp);
		     }else
		     {
		    	 st.push(Integer.parseInt(op));
		     }

			 
			 
		 }
	        for(int i:st)
	        {
	        	score+=i;
	        }
		 return score;
	    }
	
	

	}
	
	
