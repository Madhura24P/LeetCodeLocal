package com.String;

import java.util.*;

public class JewelsStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int numJewelsInStones(String jewels, String stones) {
		  int cnt=0;
		  List<Character> l=new ArrayList<>();
		  for(char c:jewels.toCharArray())
		  { 
			l.add(c);  
		  }
		  
		  for(char c:stones.toCharArray())
		  {
			  if(l.contains(c))
			  {
				cnt++;  
			  }
			  
		  }
		  
		  
		  return cnt;
	        
	    }

}
