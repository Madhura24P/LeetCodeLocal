package com.search;

public class FindSmallestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public char nextGreatestLetter(char[] letters, char target) {
		 
		 if (target >= letters[letters.length-1]) {
	            return letters[0];
	        }
	        
	        int start = 0;
	        int end = letters.length - 1;
	        while (true) {
	            int mid = start + (end - start) / 2;
	            if (start > end) {
	                return letters[start];
	            } else if (target >= letters[mid]) {
	                start = mid + 1;
	            } else if (target < letters[mid]) {
	                end = mid - 1;
	            }
	        }
	        
	    }
	  
	 
	 

}
