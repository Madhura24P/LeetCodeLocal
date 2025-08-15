  package com.sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortCountingOnes {

	static Map<Integer,Integer> map=new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {3,4,5};
		countOnes(nums);
		System.out.println(map.toString());
		
		Map<Integer,Integer> sortedMap=map.entrySet().
				stream().
				sorted(Map.Entry.<Integer,Integer>comparingByValue().
						thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (e1, e2) -> e1,
		                LinkedHashMap::new
		            ));
		
		System.out.println(sortedMap.toString());

	}
	
	public static void countOnes(int[] nums)
	{
		int count;
		for(int n:nums)
		{
			count=ones(n);
			map.put(n, count);
		}
	}
// nums>>1 & 1 -if last digit is 1 or not	
	public static int ones(int num)
	{
		int count=0;
		while(num!=0)
		{
			if(num%2==1)
			{
				count++;
			}
			num=num/2;
			
		}
		return count;
	}

}
