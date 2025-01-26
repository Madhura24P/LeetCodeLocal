package com.Array;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void sortColors(int[] nums) {
        
		 
		int R=nums.length-1;
		int curr=0;
		int L=0;
		
		while(curr<=R)
		{
			
			
			if(nums[curr]==0)
			{
				int temp=nums[curr];
				nums[curr]=nums[L];
				nums[L]=temp;
				L++;
				curr++;
				
			}
			else if(nums[curr]==1)
			{
				curr++;
			}
			else 
			{
				int temp=nums[R];
				nums[R]=nums[curr];
				nums[curr]=temp;
				R--;
				
			
			}
			
		}
        
    }

}
