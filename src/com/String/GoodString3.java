package com.String;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GoodString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="677793331";
		
		Map<Character,Long> sMap=s.chars().mapToObj(x->(char)x).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		char c=sMap.entrySet().stream().
	     sorted(Map.Entry.<Character,Long>comparingByKey().reversed()).
	     filter(x->x.getValue()==3).findFirst().get().getKey();
		int inx=s.indexOf(c);
		System.out.println(inx);
		System.out.println(c);

	}
	
	 public String largestGoodInteger(String num) {
		 char maxChar=' ';
		 char[] nArr=num.toCharArray();
		 for(int i=2;i<nArr.length;i++)
		 {
			 if(nArr[i]==nArr[i-1] && nArr[i]==nArr[i-2])
			 {
				 maxChar=(char) Math.max(maxChar, nArr[i]);
			 }
		 }
		 
		 if(maxChar==' ')
		 {
			 return "";
		 }
		 
         return new String(new char[] {maxChar,maxChar,maxChar});
	        
	    }

}
