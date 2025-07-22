package com.greedy;

public class MinOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,5,2,4,1};
		minOperations(nums);

	}
	
    public static int minOperations(int[] nums) {

        //1 5 2 4 1
        //1 5 6 4 1 --4
        //1 5 6 7 1 --3
        //1 5 6 7 8 --7
    	int min=0;
    	for(int i=0;i<nums.length-1;i++)
    	{
    		if(nums[i]<nums[i+1]) continue;
    		else
    		{
    			int diff=nums[i]-nums[i+1];
    			min=min+(diff+1);
    			nums[i+1]=nums[i+1]+diff+1;
    		}
    		
    	}
    	System.out.println(min);
        return min;
    }

}
