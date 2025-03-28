package com.search;

import java.util.Arrays;

public class FindFirstandLastPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,7,8,8,10};
		searchRange(nums, 8);
		
		int nums2[]= {2,2};
		searchRange(nums2, 2);

	}
	
public static int[] searchRange(int[] nums, int target) {
	
	int res[]=new int[2];
	Arrays.fill(res, -1);
	if(nums.length==0)
	{
		return res;
	}
	
	int low =0;
	int high=nums.length-1;
	
	while(low<high)
	{
		int mid=low+(high-low)/2;
		if(nums[mid]<target)
		{
			low =mid+1;
		}else
		{
			high=mid;
		}
	}
	
	System.out.println(low);
	if(nums[low]!=target)
	{
		return res;
	}
	res[0]=low;
	
	
	high=nums.length;
	int lastOcc=0;
	while(low<high)
	{
		int mid=low+(high-low)/2;
	    if(nums[mid]<=target)
		{
			low=mid+1;
		}else
		{
			high=mid;
		}
	}
	
	lastOcc=low-1;
	System.out.println(lastOcc);
	res[1]=lastOcc;

	
	System.out.println(Arrays.toString(res));
	
	
	
	
	
	
	return res;
        
    }

}
