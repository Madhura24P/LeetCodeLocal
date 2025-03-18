package com.String;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstUniqChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="loveleetcode";
		//firstUniqChar(s);
		
		
		
		Optional<Entry<String,Long>> s1=Stream.of(s.split("")).collect(
				Collectors.groupingBy(
						Function.identity(),LinkedHashMap::new
						,Collectors.counting())
				).entrySet().stream().filter(x->x.getValue()==1).
		findFirst();
		
		if(s1.isPresent())
		{
			System.out.println(s1.get().getKey());
			System.out.println(s.indexOf(s1.get().getKey()));
		}else
		{
			System.out.println(-1);
		}

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
