package com.String;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public boolean isAnagram(String s, String t) {
	boolean flag=false;
	char []c_s=s.toCharArray();
	char []c_t=t.toCharArray();
	Arrays.sort(c_t);
	Arrays.sort(c_s);
	
	flag=Arrays.compare(c_s, c_t)==0;
	
	
	return flag;
        
    }

}
