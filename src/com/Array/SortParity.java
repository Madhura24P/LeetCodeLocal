package com.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {3,1,2,4};
		sortArrayByParity(nums);
		sortParity_8(nums);

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
	
	//System.out.println(Arrays.toString(res));
	return res;
        
    }

public static void sortParity_8(int nums[])
{
	List<Integer> res=
			Stream.concat(
			Arrays.stream(nums).boxed().toList().stream().filter(x->x%2==0),
			Arrays.stream(nums).boxed().toList().stream().filter(x->x%2!=0)).
			toList();
	System.out.println(res);
	res.stream().mapToInt(x->x).toArray();
	
}

}
