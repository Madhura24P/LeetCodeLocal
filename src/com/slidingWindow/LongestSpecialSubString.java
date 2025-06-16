package com.slidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class LongestSpecialSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maximumLength("aaaa");

	}
	 public static int maximumLength(String s) {
		 Map<String,Integer> map=new HashMap<>();
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=i+1;j<=s.length();j++)
			 {
				 String st=s.substring(i, j);
				 if(map.containsKey(st))
				 {
					 map.put(st, map.get(st)+1);
				 }else
				 {
					 map.put(st, 1);
				 }
				 
				 
			 }
		 }
		 
		 int maxLength=0;
		 
		 for(Map.Entry<String, Integer> e:map.entrySet())
		 {
			 System.out.println(e.getKey());
			 if(e.getValue()>=3)
			 {
				 if(Stream.of(e.getKey().split("")).distinct().count()==1)
				 maxLength=Math.max(maxLength, e.getKey().length());
			 }
		 }
		 
		 System.out.println(maxLength);
	        return maxLength;
	    }

}
