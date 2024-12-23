package com.TwoPointer.Easy;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {3,1,3,3};
				int val = 3;
				removeElement(nums, val);

	}
	
public static int removeElement(int[] nums, int val) {
	
	int apointer=0;
	int bpointer=nums.length-1;
	
	while(apointer<=bpointer)
	{
		if(nums[apointer]==val)
		{
			int temp=nums[bpointer];
			nums[bpointer]=nums[apointer];
			nums[apointer]=temp;
			bpointer--;
			
		}else
		{
			//apointer++;
			while(apointer<nums.length)
            {
                if(nums[apointer]==val)
                {
                    apointer++;
                }else
                {
                    apointer++;
                    break;
                }
            }
		}
	}
	System.out.println(Arrays.toString(nums));
	System.out.println(apointer);
	
	return apointer;
        
    }

}
