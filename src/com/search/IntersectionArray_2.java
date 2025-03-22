package com.search;

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


public  static int[] intersect_8(int[] nums1, int[] nums2) {

	List<Integer> num1List=Arrays.stream(nums1).boxed().toList();
	List<Integer> num2List=Arrays.stream(nums2).boxed().toList();
	List<Integer> res=new ArrayList<>();
	
	num1List.stream().forEach(x -> {
		if(num2List.contains(x) && !res.contains(x))
		{
			int count=Math.min(Collections.frequency(num1List, x),
            Collections.frequency(num2List, x));
			while(count>0)
			{
				res.add(x);
				count--;
			}
		}
	});
	
	return res.stream().mapToInt(x->x).toArray();
}

}
