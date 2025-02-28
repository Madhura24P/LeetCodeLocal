package com.TwoPointer.Easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,2,7,11,15};
		int target = 9;
		
		//twoSum(nums, target);
		twoSum_java8(nums,target);

	}
	
public static int[] twoSum(int[] nums, int target) {
	Map<Integer,Integer> mapElements=new HashMap<>();
	
	int [] result=new int[2];
	int index=0;
	for(int n:nums)
	{
		if(mapElements.containsKey(target-n))
		{
			result[1]=index;
			result[0]=mapElements.get(target-n);
		}else
		{
			mapElements.put(n, index);
		}
		index++;
	}
	
	System.out.println(Arrays.toString(result));
     return result;
    }


public static void twoSum_java8(int nums[],int target)
{
	List<Integer> numList=Arrays.stream(nums).boxed().toList();
	Map<Integer,Integer> numMap=numList.stream().collect(
			Collectors.toMap(x->Integer.valueOf(target)-x,x->numList.indexOf(x)));
	
	List<Integer> filterList=numList.stream().filter(x->numMap.containsKey(x)).collect(Collectors.toList());
	
	int res[]=filterList.stream().map(x->numMap.get(x)).mapToInt(Integer::new).toArray();
	System.out.println(Arrays.toString(res));
	
}


}
