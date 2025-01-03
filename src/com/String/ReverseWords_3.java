package com.String;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		reverseWords(s);

	}
	
public static String reverseWords(String s) {
	String rev="";
	
	rev=Stream.of(s.split(" ")).map(s1->new StringBuilder(s1).reverse()).collect(Collectors.joining(" "));
	System.out.println(rev);
	
	
      return rev;  
    }

}
