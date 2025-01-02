package com.Array;

import java.util.Arrays;

public class ReverserStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[]= {'h','a','t'};
		reverseString(s);

	}
	
	 public static void reverseString(char[] s) {
		 
		 int a=0;
		 int b=s.length-1;
		 
		 while(a<b)
		 {
			 char t=s[a];
			 s[a]=s[b];
			 s[b]=t;
			 a++;
			 b--;
			 
		 }
		 
	      System.out.println(Arrays.toString(s))  ;
	    }

}
