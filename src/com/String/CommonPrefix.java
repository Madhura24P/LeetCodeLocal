package com.String;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String longestCommonPrefix(String[] strs) {

	        Arrays.sort(strs);
	        String s1=strs[0];
	        String s2=strs[strs.length-1];
	        StringBuilder comm=new StringBuilder("");
	        for(int i=0;i<Math.min(s2.length(),s1.length());i++)
	        {
	            if(s1.charAt(i)==s2.charAt(i))
	            {
	                comm.append(s1.charAt(i));

	            }
	            else
	            {
	                break;
	            }
	        }

	        return comm.toString();
	        
	    }

}
