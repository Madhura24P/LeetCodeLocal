package com.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,6,1,4};
		
		sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sort(int []nums)
	{
		
		
		for(int i=1;i<nums.length;i++)
		{
			int temp=nums[i];
			int j=i-1;
			
			while(j>=0 && nums[j]>temp)
			{
				nums[j+1]=nums[j];
				j=j-1;
			}
			
			nums[j+1]=temp;
			
		}
		
		
	}

}
