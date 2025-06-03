package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(candidates);
		findCombo(0, candidates, target, ans, new ArrayList<>());
		
		return ans;
	        
	    }

	private void findCombo(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> ds)
	{
		
			if(target==0)
			{
				ans.add(new ArrayList<>(ds));
				return;
			}
		
		for(int i=index;i<arr.length;i++)
		{
			if(i>index && arr[i]==arr[i-1]) continue;
			if(arr[i]>target)break;
			
			ds.add(arr[i]);
			findCombo(i+1, arr, target-arr[i], ans, ds);
			ds.remove(ds.size()-1);

		}
		
	}

}
