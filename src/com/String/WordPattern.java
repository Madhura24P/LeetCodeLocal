package com.String;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="abba";
		String s="dog cat cat fish";
		wordPattern(pattern, s);

	}
	
	 public static boolean wordPattern(String pattern, String s) {
		 
		 Map<Character,String> map=new HashMap<>();
		 char [] c=pattern.toCharArray();		 
		 List<String> l=Stream.of(s.split(" ")).collect(Collectors.toList());
		 System.out.println(l);
		 
		 if(c.length!=l.size())
		 {
			 return false;
		 }
		 
		 for(int i=0;i<c.length;i++)
		 {
			 char c_i=c[i];
			 String l_i=l.get(i);
			 
			 if(map.containsKey(c_i))
			 {
				 if(l_i.equals(map.get(c_i)))
				 {
					
					 continue;
				 }else
				 {
					 return false;
				 }
				 
			 }else
			 {
				 if(map.containsValue(l_i))
						 {
					 return false;
						 }
				 map.put(c_i, l_i);
			 }
		 }
		 
		 System.out.println(map);
		 return true;
	        
	    }

}
