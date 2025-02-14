package com.Array;

import java.util.*;

public class MaxLengthConcatenated {
	
public int maxLength(List<String> arr) {
	List<String> result=new ArrayList<>();
	result.add("");
	
	for(String s:arr)
	{
		if(hasDuplicate(s))
		{
			continue;
		}
		
		List<String> currList=new ArrayList<String>();
		for(String s1:result)
		{
			StringBuilder sb=new StringBuilder();
			sb.append(s1);
			if(hasDuplicate(sb.toString()))
			{
				currList.add(sb.toString());
			}
		}
		
		result.addAll(currList);
		
	}
	
	
	int maxLength=0;
	for(String s1:result)
	{
		maxLength=Math.max(maxLength, s1.length());
	}
	return maxLength;
        
    }



private boolean hasDuplicate(String s)
{
	boolean []visited=new boolean[26];
	for(char c1:s.toCharArray())
	{
		if(visited[c1-'a'])
		{
			return false;
		}else
		{
			visited[c1-'a']=true;
		}
	}
	
	return true; 
}



}
