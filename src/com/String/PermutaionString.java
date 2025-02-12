package com.String;

import java.util.*;

public class PermutaionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="adc";
		
		String s2="dcda";
		
		checkInclusion(s1, s2);

	}
	 public static boolean checkInclusion(String s1, String s2) {
		 
		 Map<Character,Integer> maps=new HashMap<>();
		 boolean flag=false;
		 
		 for(char c:s1.toCharArray())
		 {
			 maps.put(c, maps.getOrDefault(c, 0)+1);
		 }
		 
		 
		 int index=0;
		 for(char c2:s2.toCharArray())
		 {
			 if(maps.containsKey(c2))
			 {
				 flag=helper(s2.substring(index,s1.length()),maps);
				 if(flag==true)
				 {
					 return true;
				 }
			 }
			 
			 index++;
		 }
		 
		 return false;
	        
	    }
	 
	 
	 private static boolean helper(String s3,Map<Character,Integer> maps)
	 {
		 
		 char [] cArr=s3.toCharArray();
		 Map<Character,Integer> mapsCopy=new HashMap<>(maps);
		 int index=0;
		 
		 while(mapsCopy.containsKey(cArr[index]) && index<cArr.length)
		 {
			 if(mapsCopy.get(cArr[index])==1)
			 {
				 mapsCopy.remove(cArr[index]);
			 }else if(mapsCopy.get(cArr[index])>1)
			 {
				 mapsCopy.put(cArr[index], mapsCopy.get(cArr[index])-1);
			 }
			 
			 index++;
		 }
		 
		 if(mapsCopy.size()<1)
		 {
			 return true;
		 }else
		 {
			 return false;
		 }
		 
	 }
	 
	 
	 public boolean checkInclusionOpt(String s1, String s2) {
	        if (s1.length() > s2.length()) return false;

	        int[] s1Count = new int[26];
	        int[] s2Count = new int[26];

	        // Count the frequency of characters in s1 and the first window of s2
	        for (int i = 0; i < s1.length(); i++) {
	            s1Count[s1.charAt(i) - 'a']++;
	            s2Count[s2.charAt(i) - 'a']++;
	        }

	        // Slide the window over s2
	        for (int i = 0; i < s2.length() - s1.length(); i++) {
	            if (matches(s1Count, s2Count)) return true;
	            // Update the window
	            s2Count[s2.charAt(i) - 'a']--;
	            s2Count[s2.charAt(i + s1.length()) - 'a']++;
	        }

	        // Check the last window
	        return matches(s1Count, s2Count);
	    }

	    private boolean matches(int[] s1Count, int[] s2Count) {
	        for (int i = 0; i < 26; i++) {
	            if (s1Count[i] != s2Count[i]) return false;
	        }
	        return true;
	    }

}
