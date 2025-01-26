package com.Array;

import java.util.Arrays;

public class ShortestUnsortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {2,6,4,8,10,9,15};
		findUnsortedSubarray(nums);

	}
	
public static int findUnsortedSubarray(int[] nums) {
	 int [] nums1 = Arrays.copyOf(nums , nums.length);
     Arrays.sort(nums1);
     int start = -1 , end = 0;

     for (int i = 0; i < nums.length; i++)
     {
         if (nums[i] != nums1[i] )
         {
             start = i;
             break;
         }
     }

     if (start == -1 ) return 0;

     for (int i = nums.length -1; i >= 0; i--) {
         if (nums[i] != nums1[i] )
         {
             end = i;
             break;
         }
     }
     return end - start + 1 ;
    }

}

