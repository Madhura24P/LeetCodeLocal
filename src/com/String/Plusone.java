package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plusone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int [] d= {1,9,9};
		plusOne(d);

	}
	
	 public static int[] plusOne(int[] digits) {
		 
		 
		 int carry=0;
		 int sum=0;
		 for(int i=digits.length-1;i>=0;i--)
		 {
			 if(i==digits.length-1)
			 {
			 sum=digits[i]+1;
			 carry=sum/10;
			 digits[i]=sum%10;
			 continue;
			 }
			  sum=digits[i]+carry;
			  carry=sum/10;
			  digits[i]=sum%10;
			 
			 
			 }
		 if(carry!=0)
		 {
			 digits=Arrays.copyOf(digits, digits.length+1);
			 digits[0]=carry;
			 
		 }
		 
		 System.out.println(Arrays.toString(digits));
	return digits;
	
	 }

}
