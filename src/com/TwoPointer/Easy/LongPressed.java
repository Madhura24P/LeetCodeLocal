package com.TwoPointer.Easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongPressed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="saeed";
		String type="ssaed";
		
		isLongPressedNameJava8(s, type);

	}
	
	 public boolean isLongPressedName(String name, String typed) {
		 
	        // Initialize pointers for name (i) and typed (j)
	        int i = 0, n = name.length(), m = typed.length();

	        // Loop through each character in 'typed'
	        for (int j = 0; j < m; ++j) {
	            // If current chars match, move both pointers
	            if (i < n && name.charAt(i) == typed.charAt(j)) {
	                ++i;
	            } 
	            // If no match, check if it's a long-pressed repeat
	            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
	                return false; // Not a valid long-pressed name
	            }
	        }

	        // Check if we've traversed the entire 'name'
	        return i == n;

	    }
	 
	 public static boolean isLongPressedNameJava8(String name, String typed) {
		
		 String typedS=Stream.of(typed.split("")).distinct().
				 collect(Collectors.joining());
		 
		 String nameS=Stream.of(name.split("")).distinct().
				 collect(Collectors.joining());
		 
		 if(nameS.equals(typedS))
		 {
			
			 Map<String,Long> typeMap=Stream.of(typed.split("")).
					 collect(Collectors.groupingBy(Function.identity(),
							 LinkedHashMap::new,
							 Collectors.counting()));
			 
			 Map<String,Long> nameMap=Stream.of(name.split("")).
					 collect(Collectors.groupingBy(Function.identity(),
							 LinkedHashMap::new,
							 Collectors.counting()));
			 boolean flag =true;
			 for(Map.Entry<String, Long> e:nameMap.entrySet())
			 {
				 if(e.getValue()>typeMap.get(e.getKey()))
						 {
					 System.out.println("false not exact match");
					 return false;
						 }
			 }
			 System.out.println("true");
			return true;
			 
		 }
		 
		 System.out.println("false not match");
		 return false;
		 
		 
	        
	    }

}
