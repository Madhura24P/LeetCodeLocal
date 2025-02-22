package com.String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortFreqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencySort("tree");

	}
	
	 public static String frequencySort(String s) {
		 
		 Map<Character,Integer> charMap=new HashMap<>();
		// int[] charArr=new int[26];
		 
		 for(char c:s.toCharArray())
		 {
			 charMap.put(c, charMap.getOrDefault(c, 0)+1);
		 }
		 
		
		 Map<Character,Integer> sortedMap=charMap.entrySet().stream().
		 sorted(
				 Map.Entry.<Character,Integer>comparingByValue()
				 .reversed()
				 ).
		 collect(
				 Collectors.toMap(Map.Entry::getKey, 
						 Map.Entry::getValue,
						 (e1,e2)->e1,LinkedHashMap::new
						 )
				 );
		 StringBuilder sb=new StringBuilder();
		 sortedMap.entrySet().stream().forEach(x->{
			 int count=x.getValue();
			 while(count>0)
			 {
				 sb.append(x.getKey());
				 count--;
			 }
			 
		 });
		 System.out.println(sortedMap);
		 System.out.println(sb);
		 
		 return s;
		 
		 
	        
	    }

}
