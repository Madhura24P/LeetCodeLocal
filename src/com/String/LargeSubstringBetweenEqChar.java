package com.String;

import java.util.HashMap;
import java.util.Map;

public class LargeSubstringBetweenEqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int maxLengthBetweenEqualCharacters(String s) {
		 
		 Map<Character,Integer> inxMap=new HashMap<>();
		 int Max=-1;
		 int n=s.length();
		 for(int i=0;i<n;i++)
		 {
			 if(!inxMap.containsKey(s.charAt(i)))
			 {
				 inxMap.put(s.charAt(i), i);
			 }else
			 {
				 int j=inxMap.get(s.charAt(i));
				 Max=Math.max(Max, (i-j-1));
				 
			 }
		 }
		 
		 return Max;
				 
	        //Opt use int[26]-
	    }

}
