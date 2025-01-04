package com.String;

import java.util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public List<String> fizzBuzz(int n) {
		  List<String> ans=new ArrayList<>();
		  int i=1;
		  while(i<=n)
		  {
			  if(i%3==0 && i%5==0)
			  {
				  ans.add("FizzBuzz");
			  }else if(i%3==0)
			  {
				  ans.add("Fizz");
			  }else if(i%5==0)
			  {
				ans.add("Buzz");  
			  }else
			  {
				  ans.add(Integer.toString(i));
			  }
			  i++;
		  }
		  
		  return ans;
	        
	    }

	
}
