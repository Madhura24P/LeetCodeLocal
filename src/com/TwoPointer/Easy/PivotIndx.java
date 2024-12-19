package com.TwoPointer.Easy;

public class PivotIndx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {1,7,3,6,5,6};
		
		int nums[]= {-1,-1,0,0,-1,-1};
		pivotIndex(nums);

	}
	
	 public static int pivotIndex(int[] nums) {
		 
		 int pivot=0;
		 int sum=0;
		
		
		 for(int i=0;i<nums.length;i++)
		 {
			 int Lsum=0;
			 int Rsum=0;
			 
			 for(int j=0;j<i;j++)
			 {
				 Lsum+=nums[j];
			 }
			 
			 for(int k=i+1;k<nums.length;k++)
			 {
				 Rsum+=nums[k];
				 
			 }
			 
			 if(Lsum==Rsum)
			 {
				 pivot=i;
				 break;
			 }
			 
		 }
		 
		 System.out.println(pivot);
		 return pivot;
	        
	    }
	 
	 
	 
	 public static int pivotIndexOptimized(int[] nums) {
	        int total = 0;
	        for (int num : nums) {
	            total += num;
	        }
	        
	        int leftTotal = 0;
	        for (int i = 0; i < nums.length; i++) {
	            int rightTotal = total - leftTotal - nums[i];
	            if (rightTotal == leftTotal) {
	                return i;
	            }
	            leftTotal += nums[i];
	        }

	        return -1;        
	    }

}
