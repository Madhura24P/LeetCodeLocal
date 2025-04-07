package com.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverserStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[]= {'h','a','t'};
		//reverseString(s);
		java8_test(s);

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
	 
	 public static  void java8_test(char s[])
	 {
		
		 
		 System.out.println(Arrays.toString(s));
		 Character[] reversedArray = IntStream.range(0, s.length)
                 .map(i -> s[s.length - 1 - i])
                 .mapToObj(c -> (char) c)
                 .toArray(Character[]::new);
		 
		 System.out.println(Arrays.toString(reversedArray));
		 

		 
		 
	 }

}
