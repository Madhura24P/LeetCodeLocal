package com.DP;

import java.util.HashMap;
import java.util.Map;

class MaxRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maxRepeating(String sequence, String word) {
		 
	        int count =0;
	        String repeated=word;
	        while(sequence.contains(repeated)){
	            count++;
	            repeated+=word;
	        }
	        return count;

	        
	    }

}
