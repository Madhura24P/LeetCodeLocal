package com.Array;

public class IncreasingTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean increasingTriplet(int[] nums) {
	        int first = Integer.MAX_VALUE;
	        int second = Integer.MAX_VALUE;

	        for (int num : nums) {
	            if (num <= first) {
	                first = num;
	            } else if (num <= second) {
	                second = num;
	            } else {
	                return true;
	            }
	        }
	        return false;
	        
	    }

}
