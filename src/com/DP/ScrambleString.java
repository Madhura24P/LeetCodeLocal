package com.DP;

import java.util.HashMap;
import java.util.Map;

public class ScrambleString {
	static Map<String,Boolean> mapdp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="great";
		String s2="rgeat";
		isScramble(s1, s2);

	}
	
	 public static boolean isScramble(String s1, String s2) {
		 mapdp=new HashMap<>();
		// int n=s1.length();
		 boolean res=solve(s1,s2);
		 System.out.println(res);
		 return res;
	        
	    }
	 
	 public static boolean solve(String s1,String s2)
	 {
		 if(s1==s2 || s1.equals(s2))
		 {
			 return true;
		 }
		 if(s1.length()!=s2.length())
		 {
			 return false;
		 }
		 if(mapdp.containsKey(s1+"_"+s2))
		 {
			 return mapdp.get(s1+"_"+s2);
		 }
		 int n=s1.length();
		 boolean res=false;
		 for(int i=1;i<n;i++)
		 {
			 boolean Notswap=solve(s1.substring(0, i),s2.substring(0, i)) && solve(s1.substring(i),s2.substring(i));
			 boolean Swap=solve(s1.substring(i),s2.substring(0,n-i)) && solve(s1.substring(0, i),s2.substring(n-i));
		     if(Notswap||Swap)
		     {
		    	 
		    	 res= true;
		    	 break;
		     }
		 }
		 mapdp.put(s1+"_"+s2, res);
		 return res;
	 }

}
