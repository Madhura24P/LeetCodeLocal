package com.search;

import java.util.Arrays;
import java.util.List;

public class MaxPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {-3,-2,-1,0,0,1,2};
		maximumCount(nums);

	}
	
public static int maximumCount(int[] nums) {
        

	nums=Arrays.stream(nums).boxed().filter(x->x!=0).mapToInt(x->x).toArray();
	System.out.println(Arrays.toString(nums));
    int start=0;
	int end=nums.length-1;
	int max=0;

   if(nums.length==0)
   {
    return 0;
   }else if(nums.length==1)
   {
    return 1;
   }
   
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		
		if( nums[mid]>0)
		{
			end=mid-1;
		}
		else
		{
			start=mid+1;
		}
		
		
	}
	int pos=nums.length-start;
    max=Math.max(pos,nums.length-pos);

	return max==0?nums.length:max;
    }



public int maximumCount8(int[] nums) {
	
	List<Integer> numList=Arrays.stream(nums).boxed().toList();
	
	int pos=(int)numList.stream().filter(x->x>0).count();
	int neg=(int)numList.stream().filter(x->x<0).count();
	
	return Math.max(pos, neg);
	
}

}
