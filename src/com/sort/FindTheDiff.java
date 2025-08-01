package com.sort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public char findTheDifference(String s, String t) {
		 // Map<Character,Integer> sChar=new HashMap<>();
		  char ct = 0;
			/*
			 * for(char c:s.toCharArray()) { sChar.put(c,sChar.getOrDefault(sChar, 0)+1); }
			 */		
		 // Map<Character,Long>cMap=s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  
		  Map<String,Long> sMap=Stream.of(s.split("")).
				  collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  
		  for(char c1:t.toCharArray())
		  {
			  if(sMap.containsKey(Character.toString(c1)) 
					  && sMap.get(Character.toString(c1))!=0)
				  sMap.put(Character.toString(c1), sMap.get(Character.toString(c1))-1);
			  else if((sMap.containsKey(Character.toString(c1)) && 
					  sMap.get(Character.toString(c1))==0)||
					  !sMap.containsKey(Character.toString(c1)))
			  {
				  ct=c1;
			  }
		  }
	        return ct;
	    }

	  
	  public char findTheDifferenceOpt1(String s, String t)
	  {
		  int sumS=0;
		  for(char c:s.toCharArray())
		  {
			  sumS+=c;
		  }
		  int sumT=0;
		  for(char c:t.toCharArray())
		  {
			  sumT+=c;
		  }
		  
		  return (char) (sumT-sumS);
	  }
}
