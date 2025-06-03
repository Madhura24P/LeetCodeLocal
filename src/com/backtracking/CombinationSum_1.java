package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public List<List<Integer>> combinationSum(int[] candidates, int target) {
	
	List<List<Integer>> ans=new ArrayList<>();
	findCombo(0, candidates, target, ans, new ArrayList<>());
	
	return ans;
        
    }

private void findCombo(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> ds)
{
	if(index==arr.length)
	{
		if(target==0)
		{
			ans.add(new ArrayList<>(ds));
		}
		return;
	}
	
	if(arr[index]<=target)
	{
		ds.add(arr[index]);
		findCombo(index, arr, target-arr[index], ans, ds);
		ds.remove(ds.size()-1);
	}
	findCombo(index+1, arr, target, ans, ds);
	
}

}
