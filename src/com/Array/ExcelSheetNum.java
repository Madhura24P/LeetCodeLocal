package com.Array;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ExcelSheetNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		titleToNumber("ZY");
		titleNum_java8("ZY");
		

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
	 
	 public static void titleNum_java8(String colTitle)
	 {
		 
		List<Integer> list= Stream.of(colTitle.split("")).
		 map(
			 (Function<String,Integer>)
				 x->
				 {
					 return x.charAt(0)-'A'+1;
					 
				 }).toList();
	
		System.out.println(list);
		int col=0;
		int p=0;
		for(int x:list)
		{
			col=col+((int)(Math.pow(26, p)*x));
			p++;
			
		}
		
		System.out.println(col);
		 
	 }

}
