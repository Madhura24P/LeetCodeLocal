package com.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,5,8,3,2};
		sort(nums,new int[nums.length],0,nums.length-1);
		System.out.println(Arrays.toString(nums));
		

	}
	
	public static void sort(int nums[],int[] temp,int low,int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			
			sort(nums,temp,low,mid);
			sort(nums,temp,mid+1,high);
			merge(nums,temp,low,mid,high);
		}
		
	}
	
	public static void merge(int nums[],int []temp,int low,int mid,int high)
	{
		
		for(int i=0;i<nums.length;i++)
		{
			temp[i]=nums[i];
			
	    }
		
		int i=low;int j=mid+1;int k=low;
		
		while(i<=mid &&j<=high)
		{
			
			if(temp[i]<=temp[j])
			{
				nums[k]=temp[i];
				i++;
			}else
			{
				nums[k]=temp[j];
				j++;
			}
			k++;
			
		}
		
		while(i<=mid)
		{
			nums[k]=temp[i];
			i++;
			k++;
		}
		
	}

}
