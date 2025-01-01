package com.String;

import java.util.*;

public class FirstUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aadadaad";
		firstUniqChar(s);

	}
	
public static int firstUniqChar(String s) {
        int index=-1;
        if(s==null)
        {
        	return -1;
        }
        
        Map<Character,Integer> cSet=new LinkedHashMap<>();
        int i=0;
        for(char c:s.toCharArray())
        {
        	
        		cSet.put(c,cSet.getOrDefault(c, 0)+1);
        	
        }
        
      System.out.println(cSet.toString());  
        if(!cSet.isEmpty())
        {
        	for(Map.Entry<Character, Integer> m:cSet.entrySet())
        	{
        		if(m.getValue()==1)
        		{
        		index=s.indexOf(m.getKey());
        		break;
        		}
        	}
        	
        }
        
        System.out.println(index);
        return index;
    }

}
