package com.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OptimalSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int partitionString(String s) {
	
	Set<Character> set=new HashSet<>();
	int end=0;
	int len=s.length();
	int count=0;
	StringBuilder sb=new StringBuilder();
	
	while(end<len)
	{
		if(!set.contains(s.charAt(end)))
		{
			set.add(s.charAt(end));
			sb.append(s.charAt(end));
			end++;
		}else
		{
			count++;
			set.clear();
			sb=new StringBuilder("");
		}
		
	}
	
	if(!sb.isEmpty())
	{
		count++;
	}

	return count++;
        
    }


public int partitionStringOpt(String s) {
	   int idx = 0;
	        int count = 0;
	        Map<Character, Boolean> mp = new HashMap<>(); // use a HashMap instead of an unordered_map
	        while (idx < s.length()) {
	            if (mp.containsKey(s.charAt(idx))) { // if current character has already appeared in current substring
	                count++; // increment count
	                mp.clear(); // clear HashMap to start a new substring
	            }
	            mp.put(s.charAt(idx), true); // mark current character as seen
	            idx++; // move to next character
	        }
	        return count + 1; 
	    }

}
