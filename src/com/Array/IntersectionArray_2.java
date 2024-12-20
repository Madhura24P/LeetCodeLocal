package com.Array;

import java.util.*;

public class IntersectionArray_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public  static int[] intersect(int[] nums1, int[] nums2) {
	
	//int res[]=new int[Math.max(nums1.length, nums2.length)];
	Map<Integer,Integer> tempMap=new HashMap<>();
	List<Integer> finalList=new ArrayList<>();
	for(int n:nums1)
	{
		tempMap.put(n, tempMap.getOrDefault(n, 0)+1);
	}
	
	for(int n1:nums2)
	{
		if(tempMap.containsKey(n1))
		{
			int val=tempMap.get(n1);
			if(val>0)
			{
			finalList.add(n1);
			}
			tempMap.put(n1, tempMap.getOrDefault(n1, 0)-1);
		}
	}
	
	
	return finalList.stream().mapToInt(Integer::intValue).toArray();
        
    }

}
