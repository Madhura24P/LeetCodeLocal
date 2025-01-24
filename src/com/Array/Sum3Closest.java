  package com.Array;

import java.util.Arrays;

public class Sum3Closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int threeSumClosest(int[] nums, int target) {

	int sum=0;
	Arrays.sort(nums);
	int min=Integer.MAX_VALUE/2;
	
	for(int i=0;i<nums.length-2;i++)
	{
		int b=i+1;
		int c=nums.length-1;
	while(b<c)
	{
		int s=nums[i]+nums[b]+nums[c];

		if(Math.abs(min-target)>Math.abs(s-target))
		{
			sum=s;
            System.out.println(sum);
			min=s;
		}
		//min=Math.min(min, 2Math.abs(s)-Math.abs(target));
				
		//b++;
        if(s<target)
        {
           b++;
        }else if (s>target)
        {
		c--;
        }
        else
        {
            return s;
        }
	}	
	}
      return min;          
    }


public int threeSumClosestOpt(int[] nums, int target) {
	
	int sum=0;
	Arrays.sort(nums);
	int min=Integer.MAX_VALUE/2;
	
	for(int i=0;i<nums.length-2;i++)
	{
		int b=i+1;
		int c=nums.length-1;
	while(b<c)
	{
		int s=nums[i]+nums[b]+nums[c];

		if(Math.abs(min-target)>Math.abs(s-target))
		{
			sum=s;
           System.out.println(sum);
			min=s;
		}
		//min=Math.min(min, 2Math.abs(s)-Math.abs(target));
				
		//b++;
       if(s<target)
       {
          b++;
       }else if (s>target)
       {
		c--;
       }
       else
       {
           return s;
       }
	}	
	}
     return min;  

       
   }

}
