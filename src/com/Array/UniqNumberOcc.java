package com.Array;

import java.util.*;

public class UniqNumberOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public boolean uniqueOccurrences(int[] arr) {
	
	Map<Integer,Integer> mArr=new HashMap<>();
	
	for(int n:arr)
	{
		mArr.put(n, mArr.getOrDefault(n, 0)+1);
		
	}
	
	//Collection<Integer> s=mArr.values();
	Set<Integer> sArr=new HashSet<>();
	
	for(Map.Entry<Integer, Integer> m:mArr.entrySet())
	{
	
		if(sArr.contains(m.getValue()))
		{
			return false;
		}else
		{
			sArr.add(m.getValue());
		}
	
	}
        return true;
    }   

}
