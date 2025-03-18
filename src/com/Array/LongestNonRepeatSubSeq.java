package com.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNonRepeatSubSeq {
	
	public static void main(String[] args) {
		
	}
	
	 public int lengthOfLongestSubstring(String s) {

	       int n = s.length();
	        int maxLength = 0;
	        Set<Character> charSet = new HashSet<>();
	        int left = 0;
	        
	        for (int right = 0; right < n; right++) {
	            if (!charSet.contains(s.charAt(right))) {
	                charSet.add(s.charAt(right));
	                maxLength = Math.max(maxLength, right - left + 1);
	            } else {
	                while (charSet.contains(s.charAt(right))) {
	                    charSet.remove(s.charAt(left));
	                    left++;
	                }
	                charSet.add(s.charAt(right));
	            }
	        }
	        
	        return maxLength;
	        
	    }

	 public static boolean isUniq(String s,int i,int j)
		{
			String s1=s.substring(i, j);
			Set<Character> Sc=new HashSet<>();
			for(char c:s1.toCharArray())
			{
				if(Sc.contains(c))
				{
					return false;
				}
				else
				{
					Sc.add(c);
				}
			}
			
			return true;
			
			
			
		}  
	 
	 
	 public int lengthOfLongestSubstring2(String s) {
		 
		    int apt=0;
			int n=s.length();
			int bpt=apt+1;
			List<String> listSubStrings=new ArrayList<>();
			Set<Character> set=new HashSet<>();
					
				while(apt<n)
					{ 
					
					set.add(s.charAt(apt));
					
			     while(bpt<n)
					 {
			    	 
			    	 if(set.contains(s.charAt(bpt)))
			    	 {
			    		 break;
			    	 }
			    	 bpt++;
						 
					 }
					String sub=s.substring(apt, bpt);//0,3--abc
					listSubStrings.add(sub);
					apt++; //1 
					bpt=apt+1; 
					
						
					}

		 return 0;
	 }
	 
	}


