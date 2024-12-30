package com.String;

import java.util.*;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bb";
		//longestPalindromeOpt(s);
		longestPalindrome(s);

	}
	
	 public static int longestPalindrome(String s) {
		 int len=0;
		 Map<Character,Integer> charMap=new HashMap<>();
		 for(char c:s.toCharArray())
		 {
			 charMap.put(c, charMap.getOrDefault(c, 0)+1);
			 
		 }
		 
		 
		 for(Map.Entry<Character, Integer> m:charMap.entrySet())
		 {
			 if(m.getValue()%2==0)
			 {
			   len+=m.getValue();
			   charMap.remove(m.getKey());
			 }
			 else if(m.getValue()>1)
			 {
				 int v=(int)Math.pow(2, (m.getValue()/2));
				 len+=v;
				 charMap.remove(m.getKey());
				 
			 }
		 }
		 
		 if(!charMap.isEmpty())
		 {
			 len+=1;
		 }
		 
		 //odd/2=2 power
		 
		 System.out.println(len);
		 //aadddc
		 //adcda
		 return len;
	        
	    }
	 
	 public static int longestPalindromeOpt(String s) {
	        // Initialize a set to keep track of characters with odd frequencies
	        HashSet<Character> charSet = new HashSet<>();
	        // Initialize the length of the longest palindrome
	        int length = 0;
	        
	        // Iterate over each character in the string
	        for (char c : s.toCharArray()) {
	            // If the character is already in the set, remove it and increase the length by 2
	            if (charSet.contains(c)) {
	                charSet.remove(c);
	                length += 2;
	            } else {
	                // If the character is not in the set, add it to the set
	                charSet.add(c);
	            }
	        }
	        
	        // If there are any characters left in the set, add 1 to the length for the middle character
	        if (!charSet.isEmpty()) {
	            length += 1;
	        }
	        
	        // Return the total length of the longest palindrome
	        return length;
	    }

}
