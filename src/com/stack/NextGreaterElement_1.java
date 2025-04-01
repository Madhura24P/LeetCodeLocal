package com.stack;

import java.util.*;

public class NextGreaterElement_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums1 = {1,3,5,2,4};
		int []nums2 = {6,5,4,3,2,1,7};
		nextGreaterElement(nums1, nums2);

	}
	
public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	int[] res=new int[nums1.length];
	Map<Integer,Integer> GEMap=new HashMap<>();
	Stack<Integer> s=new Stack();
	for(int i=nums2.length-1;i>=0;i--)
	{
		if(i==nums2.length-1)
		{
			GEMap.put(nums2[i], -1);
			s.push(nums2[i]);
		}
		else
		{
		while(nums2[i]>s.peek())
			{
				s.pop();
				//s.push(nums2[i]);
				//GEMap.put(nums2[i], -1);
			}
		
		if(!s.isEmpty() && nums2[i]<s.peek())
			{
				GEMap.put(nums2[i], s.peek());
				s.push(nums2[i]);
				
			}
		else
		{
			s.push(nums2[i]);
			GEMap.put(nums2[i], -1);
		}
		
		}
	}
	
	
	
	System.out.println(GEMap.toString());
	int j=0;
	for(int n1:nums1)
	{
		int val=GEMap.get(n1);
		res[j]=val;
		j++;
		
	}
	
	System.out.println(Arrays.toString(res));
	return res;
        
    }

}
