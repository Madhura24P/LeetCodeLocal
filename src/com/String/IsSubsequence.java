package com.String;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IsSubsequence {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isSubsequence(String s, String t) {
	       // boolean flag=false;
	        int s_p=0;
	        int t_p=0;
	        char tarr[]=t.toCharArray();
	        char sarr[]=s.toCharArray();
	        
	        while(t_p<t.length() && s_p<s.length())
	        {
	        	if(tarr[t_p]==sarr[s_p])
	        	{
	        		s_p++;
	        	}
	        	
	        	t_p++;
	        }
	        
	        return s_p==s.length();
	    }

	 public static void isSub_java8(String s,String t)
	 {
		 
		 OptionalInt indexOpt = IntStream.range(0, s.length() - t.length() + 1)
		            .filter(i -> s.substring(i, i + t.length()).equals(t))
		            .findFirst();
		if (indexOpt.isPresent()) {
		System.out.println("First occurrence of substring is at index: " + indexOpt.getAsInt());
		} else {
		System.out.println("Substring not found.");
		}

		 
	 }

}
