package com.TwoPointer.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergesortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {1,2,3,0,0,0};
		int m = 3;
		int []nums2 = {2,5,6};
		int n = 3;
		merge_Java8(nums1, m, nums2, n);

	}
	
	 public void mergeOpt(int[] nums1, int m, int[] nums2, int n) {
         int i = m - 1;
	        int j = n - 1;
	        int k = m + n - 1;
	        
	        while (j >= 0) {
	            if (i >= 0 && nums1[i] > nums2[j]) {
	                nums1[k--] = nums1[i--];
	            } else {
	                nums1[k--] = nums2[j--];
	            }
	        }
		 
    }
	 
	 public static void merge_Java8(int[] nums1,int m,int[] nums2,int n)
	 {
		 List<Integer> list1=Arrays.stream(nums1).boxed().toList();
		 List<Integer> list2=Arrays.stream(nums2).boxed().toList();
		 
		 
		 Stream<Integer> s=Stream.concat(list1.stream(), list2.stream());
		 List<Integer> res=s.sorted(
				 Comparator.comparing(Integer::intValue)).
				 filter(x->x!=0)
				 .toList();
		 System.out.println(res);
		 
		
		 
	 }

}
