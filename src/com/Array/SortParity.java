package com.Array;

import java.util.Arrays;

public class SortParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {3,1,2,4};
		sortArrayByParity(nums);

	}
	
public static int[] sortArrayByParity(int[] nums) {
	
	int res[]=new int[nums.length];
	int a=0;
	int b=res.length-1;
	int p=0;
	while(p< nums.length)
	{
		if(nums[p]%2==0)
		{
			res[a]=nums[p];
			a++;
		}else
		{
			res[b]=nums[p];
			b--;
		}
		p++;
	}
	
	System.out.println(Arrays.toString(res));
	return res;
        
    }

}
