package com.String;

import java.util.*;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="LVIII";
			romanToInt(s);

	}
	
public static int romanToInt(String s) {
	int res=0;
	/*
	 * Map<Character,Integer> mapR=new HashMap<>(); mapR.put('I', 1); mapR.put('V',
	 * 5); mapR.put('X', 10); mapR.put('L', 50); mapR.put('C', 100); mapR.put('D',
	 * 500); mapR.put('M', 1000); char [] sarr=s.toCharArray(); int temp=0;
	 * 
	 * for(int i=0;i<s.length();i++) { if(sarr[i]!='I') { res=res+mapR.get(sarr[i]);
	 * }else { temp=temp+mapR.get(sarr[i]); }
	 * 
	 * 
	 * }
	 * 
	 * if(s.charAt(s.length()-1)!='I') { res=res-temp; }else { res=res+temp; }
	 * 
	 * System.out.println(res); return res;
	 */
	Map<Character,Integer> roman=new HashMap<>(); 
	roman.put('I', 1);
	roman.put('V',5); 
	roman.put('X', 10); roman.put('L', 50); 
	roman.put('C', 100); roman.put('D',500); roman.put('M', 1000);
	
	for (int i = 0; i < s.length() - 1; i++) {
        if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
            res -= roman.get(s.charAt(i));
        } else {
            res += roman.get(s.charAt(i));
        }
    }

    return res + roman.get(s.charAt(s.length() - 1));  
        
    }

}
