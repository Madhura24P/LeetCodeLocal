package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sumSubset=new ArrayList<>();
		List<Integer> arr=Arrays.asList(1,2,3);
		func(0,0,arr,arr.size(),sumSubset);

	}
	
	public static void func(int index,int sum,List<Integer> arr,int N,List<Integer> sumSubset)
	{
		if(index==N)
		{
			sumSubset.add(sum);
			return;
		}
		//pick
		func(index+1, sum+arr.get(index), arr, N, sumSubset);
		//do not pick
		func(index+1,sum,arr,N,sumSubset);
	}

}
