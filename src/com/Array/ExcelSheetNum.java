package com.Array;

public class ExcelSheetNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		titleToNumber("ZY");

	}
	
	 public static int titleToNumber(String columnTitle) {
		 
		 int n=columnTitle.length();
		 int col=0;
		 int pow=0;
		 char []arr=columnTitle.toCharArray();
		 
		 
		 for(int i=n-1;i>=0;i--)
		 {
			 col=col+((int)Math.pow(26, pow)*(arr[i]-'A'+1));
			 pow++;
			 
		 }
		 System.out.println(col);
		 return col;
	        
	    }

}
