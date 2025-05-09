package com.slidingWindow;

import java.util.Arrays;
import java.util.List;

public class ZeroSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,3,0,0,2,0,0,4};
		zeroFilledSubarray(nums);

	}
	 public static long zeroFilledSubarray(int[] nums) {
		 
		 List<Integer> numsList=Arrays.stream(nums).boxed().toList();
		 
		 int n=numsList.size();
		 int apt=0;
		 int bpt=apt+1;
		 int count=0;
		 
		 while(apt<n)
		 {
			 if(numsList.get(apt)!=0)
			 {
				 apt++;
				 continue;
			 }
			 bpt=apt+1;
			 count++;
			 while(bpt<n)
			 {
				 if(numsList.get(bpt)!=0)
				 {
					 
					 break;
				 }
				 
				 count++;
				 bpt++;
			 }
			 
			 apt++;
			 //bpt=apt+1;
		 }
	       System.out.println(count); 
		 return count;
	    }
	 
	 public long zeroFilledSubarrayOpt(int[] nums) {
	        long cnt = 0, zeroSubarraysEndingAtCurrentIndex = 0;
	        for (int n : nums) {
	            if (n == 0) {
	                cnt += ++zeroSubarraysEndingAtCurrentIndex;
	            }else {
	                zeroSubarraysEndingAtCurrentIndex = 0;
	            }
	        }
	        return cnt;
	    }

}
