package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canConstruct("aa", "aab");
		

	}
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 
		 Map<String,Long> mR=Stream.of(ransomNote.split("")).
				 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		 Map<String,Long> mMap=Stream.of(magazine.split("")).
				 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	     
		 System.out.println(mMap);
		 System.out.println(mR);
		 
		
		 
	     for(Map.Entry<String, Long> s:mR.entrySet())
	      {
	    	  if(mMap.containsKey(s.getKey()))
	    	  {
	    		  if(mMap.get(s.getKey())<s.getValue())
	    		  {
	    			  return false;
	    		  }
	    	  }
	    	  else
	    	  {
	    		  return false;
	    	  }
	    	  
	      }
	      
	      return true;		 
	    }
	 
	 public boolean canConstructOpt(String ransomNote, String magazine) {
	        HashMap<Character, Integer> magaHash = new HashMap<>();

	        for (char c : magazine.toCharArray()) {
	            magaHash.put(c, magaHash.getOrDefault(c, 0) + 1);
	        }

	        for (char c : ransomNote.toCharArray()) {
	            if (!magaHash.containsKey(c) || magaHash.get(c) <= 0) {
	                return false;
	            }
	            magaHash.put(c, magaHash.get(c) - 1);
	        }

	        return true;
	    }

}
