package com.String;

import java.util.HashSet;
import java.util.Set;

public class MinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int minimumLength(String s) {
		 
		 int apt=0;
		 int bpt=s.length()-1;
		 
		 Set<Character> suf=new HashSet<>();
		 Set<Character> pref=new HashSet<>();
		 
		 while(apt!=bpt)
		 {
			  apt=0;
			  bpt=s.length()-1;

			 
			 char char_a=s.charAt(apt);
			 char char_b=s.charAt(bpt);
			 
			 if((int)char_a==(int)char_b)
			 {
				 
				 pref.add(char_a);
				 suf.add(char_b);
				 apt++;
				 bpt--;
				 
				 while(pref.contains(s.charAt(apt)))
						 {
					           apt++;
						 }
				 
				 while(suf.contains(s.charAt(bpt)))
				 {
					 bpt--;
				 }
				 
				 s=s.substring(apt, bpt+1);
				 System.out.println(s);
				 suf.remove(char_b);
				 pref.remove(char_a);
				 
			 }else
			 {
				 break;
			 }
			 
		 }
		 
		 return s.length();
	        
	    }
	 
	 public static int min(String s)
	 {
		 int left = 0;
	        int right = s.length() - 1;
	        
	        while (left < right && s.charAt(left) == s.charAt(right)) {
	            char current = s.charAt(left);
	            while (left <= right && s.charAt(left) == current) {
	                left++;
	            }
	            while (right >= left && s.charAt(right) == current) {
	                right--;
	            }
	        }
	        
	        return right - left + 1;
	 }

}
