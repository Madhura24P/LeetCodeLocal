package com.String;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c={'a','b','b','c','c','c'};
		compress(c);

	}
	
	 public static int compress(char[] chars) {
		 
		 StringBuilder sb=new StringBuilder();
		 Stream<Character> charStream = new String(chars)
                 .chars()
                 .mapToObj(c -> (char) c);
		 charStream.collect(Collectors.groupingBy(Function.identity(),
				 LinkedHashMap::new,Collectors.counting()))
		 .entrySet().stream().forEach(x-> {
			 
			 if(x.getValue()==1)
			 {
				 ///System.out.println(x.getValue());
				 sb.append(x.getKey());
			 }else
			 {
				 //6System.out.println(x.getValue());
				 sb.append(x.getKey()).append(x.getValue());
			 }
		 });
		 System.out.println(sb);
	        return sb.length();
	    }

}
