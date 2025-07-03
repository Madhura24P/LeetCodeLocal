package com.search;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1[]= {1,2,3};
		int num2[]= {2,4};

		List<Integer> num1List=Arrays.stream(num1).mapToObj(Integer::valueOf).
				collect(Collectors.toList());
		List<Integer> num2List=Arrays.stream(num2).mapToObj(Integer::valueOf).
				collect(Collectors.toList());
		int n1=0,n2=0;
		if(num1.length>num2.length)
		{
			n1=num1List.stream().filter(n->num2List.contains(n)).
					findFirst().get();
		}else
		{
			n2=num2List.stream().filter(n->num1List.contains(n)).
					findFirst().get();
		}

		System.out.println("n1 :"+n1+" n2: "+n2);

	}

	public int getCommon(int[] nums1, int[] nums2) {
		int i = 0, j = 0;
		int n = nums1.length;
		int m = nums2.length;

		while (i < n && j < m) {
			if (nums1[i] == nums2[j])
				return nums1[i];
			else if (nums1[i] > nums2[j])
				j++;
			else
				i++;
		}

		return -1;

	}

}
