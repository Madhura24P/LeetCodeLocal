package com.String;

public class Palindrome_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abac";
		validPalindrome(s);

	}
	
	 public static boolean validPalindrome(String s) {
		boolean flag=false;
		 
		 int apt=0;
		 int bpt=apt;
		 while(apt<s.length() && bpt<s.length())
		 {
			 String s_sub=s.substring(apt, bpt)+s.substring(bpt+1);
			 System.out.println(s_sub);
			 if(isPalindrome(s_sub))
			 { 
				 //System.out.println(s_sub);
				 flag=true;
				 System.out.println(flag);
				 
				 //break;
			 }
			 if(bpt<s.length())
			 bpt++;
			 else
			 { apt++;
			bpt=apt+1;
			 }
		 }
		 
		 return flag;
	        
	    }
	 
	 private static boolean isPalindrome(String s)
	 {
		// boolean flag=true;
		 StringBuilder sb=new StringBuilder(s);
		 String s_sb=sb.reverse().toString();
		 
		 return s.equals(s_sb);
	 }
	 
	 public boolean validPalindromeOpt(String s) {
	        int left = 0;
	        int right = s.length() - 1;
	        
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return isPalindromeOpt(s, left + 1, right) || 
	                       isPalindromeOpt(s, left, right - 1);
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	    
	    private boolean isPalindromeOpt(String s, int left, int right) {
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

}
