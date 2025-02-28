package com.Array;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,2,1};
		int []nums2 = {2,2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
		

	}
	
public static int[] intersection(int[] nums1, int[] nums2) {
	Set<Integer> interSet=new HashSet<>();
	Set<Integer> set=new HashSet<>();
	if (nums1.length>nums2.length)
	{
		for(int i=0;i<nums1.length;i++)
		{
			set.add(nums1[i]);
		}
		
		for(int j=0;j<nums2.length;j++)
		{
			if(set.contains(nums2[j]))
			{
				interSet.add(nums2[j]);
			}
		}
	}
	else
	{
		for(int i=0;i<nums2.length;i++)
		{
			set.add(nums2[i]);
		}
		
		for(int j=0;j<nums1.length;j++)
		{
			if(set.contains(nums1[j]))
			{
				interSet.add(nums1[j]);
			}
		}
		
	}
	
	
	
	System.out.println(interSet);
	return interSet.stream().mapToInt(Integer::intValue).toArray();

        
    }

public int[] intersectionOptimized(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums1) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    List<Integer> resultList = new ArrayList<>();
    for (int num : nums2) {
        if (map.containsKey(num)) {
            resultList.add(num);
            map.remove(num);
        }
    }
    
    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
        result[i] = resultList.get(i);
    }
    return result;
}


public void intersect_java8(int[] nums1,int[] nums2)
{
	List<Integer> nums1List=Arrays.stream(nums1).boxed().toList();
    List<Integer> nums2List=Arrays.stream(nums2).boxed().toList();
    
    Set<Integer> numSet=nums1List.stream().filter(x->nums2List.contains(x)).
    		collect(Collectors.toSet());
    
    numSet.stream().mapToInt(Integer::intValue).toArray();

}

}
