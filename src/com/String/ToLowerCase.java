package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String toLowerCase(String s) {
		 
		 StringBuilder sb=new StringBuilder();
		 
		 
		 IntStream.range(0, s.length()).forEach(i -> {
			  if(s.charAt(i)>'A' && s.charAt(i)<'Z')
			  {
				  char c=(char) (s.charAt(i)-'A'+'a');
				  sb.append(c);
				  
			  }else
			  {
				  sb.append(s.charAt(i));
			  }
			 
		 });		 
		 
		 return sb.toString();
	        
	    }

}
