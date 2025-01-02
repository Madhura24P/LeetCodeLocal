package com.String;

public class IsSubsequence {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean isSubsequence(String s, String t) {
	       // boolean flag=false;
	        int s_p=0;
	        int t_p=0;
	        char tarr[]=t.toCharArray();
	        char sarr[]=s.toCharArray();
	        
	        while(t_p<t.length() && s_p<s.length())
	        {
	        	if(tarr[t_p]==sarr[s_p])
	        	{
	        		s_p++;
	        	}
	        	
	        	t_p++;
	        }
	        
	        return s_p==s.length();
	    }


}
