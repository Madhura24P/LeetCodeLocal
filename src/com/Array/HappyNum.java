package com.Array;

import java.util.*;

public class HappyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isHappy(19);

	}
	
	 public static boolean isHappy(int n) {
        boolean flag=false;
        Set<Integer> visited=new HashSet<>();
        
        while(!visited.contains(n))
        {
        	visited.add(n);
        	n=getNumber(n);
        	
        	if(n==1)
        	{
        		System.out.println(flag);
        		return true;
        	}
        	
        }

        return flag;
	        
	    }
	 
	 private static int getNumber(int n)
	 {
		 int sumSq=0;
		 
		 while(n>0)
		 {
			 int rem=n%10;
			 sumSq+=rem*rem;
			 n=n/10;
		 }
		 
		 return sumSq;
		 
	 }

}
