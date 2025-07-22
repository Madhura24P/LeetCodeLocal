package com.greedy;


public class Max69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maximum69Number (int num) {
		 
		 char[] arr = String.valueOf(num).toCharArray();
	        for(int i=0; i<arr.length; i++){
	            if(arr[i] == '6'){
	                arr[i] = '9';
	                break;
	            }
	        }

	        return Integer.parseInt(String.valueOf(arr));
		
	        
	    }

}
