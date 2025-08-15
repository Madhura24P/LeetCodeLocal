package com.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxFreqCountSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public int maxFrequencyElements(int[] nums) {
		  
		  Long max=Arrays.stream(nums).boxed().collect(Collectors.toList()).
		  stream().collect(
				  Collectors.groupingBy(Function.identity(),Collectors.counting())
				  ).entrySet().stream().
		  sorted(Map.Entry.<Integer,Long>comparingByValue().reversed()).findFirst().get().getValue();
		  
		int arr[]=new int[101];
		int Max=0;
		int sum=0;
		for(int n:nums)
		{
			arr[n]++;
			if(arr[n]==Max)
			{
				//Max=arr[n];
				sum+=Max;
			}else if(arr[n]>Max)
			{
				Max=arr[n];
				sum=Max;
				
			}
			
		}
		
		return sum;
	  
	  }
}
