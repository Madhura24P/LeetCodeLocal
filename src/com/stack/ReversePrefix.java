package com.stack;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReversePrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String reversePrefix(String word, char ch) {
		 OptionalInt op=IntStream.range(0, word.length()).
				 filter(x->ch==word.charAt(x)).findFirst();
		 if(!op.isPresent())
		 {
			 return word;
		 }
		 
		 String sw=word.substring(0, op.getAsInt()+1);
	     StringBuilder sw_b=new StringBuilder(sw);  
	     return sw_b.reverse().append(word.substring(op.getAsInt()+1)).toString();
	    }

}
