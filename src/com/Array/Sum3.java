package com.Array;

import java.util.*;
import java.util.stream.Collectors;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {-2,0,1,1,2};

	}

	
	 public List<List<Integer>> threeSum(int[] nums) {
		 int target=0;
		 Set<List<Integer>> s=new HashSet<>();
		 
		 Arrays.sort(nums);
		 //-4,-1,-1,0,1,2
		
		 int apt=0;
		 int bpt=nums.length-1;
		 
		 while(apt+1<bpt)
		 {
			 int sum=nums[apt]+nums[apt+1]+nums[bpt];
			 if(sum<0)
			 {
				 apt++;
			 }
			 if(sum==0)
			 {
				 List<Integer> l=new ArrayList<>();
				 l.add(nums[apt]);
				 l.add(nums[apt+1]);
				 l.add(nums[bpt]);
				System.out.println(l);
				 s.add(l);
				 apt++;
				 bpt--;
			 }
			 if(sum>0)
			 {
				 bpt--;
			 }
			 
		 }
		 
		 
		 
	        return s.stream().collect(Collectors.toList()); 
	    }
	
	 
	 public List<List<Integer>> threeSumOpt(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<>();

	        // Sort the array
	        Arrays.sort(nums);

	        for (int i = 0; i < nums.length - 2; i++) {
	            // Skip duplicate elements for i
	            if (i > 0 && nums[i] == nums[i - 1]) {
	                continue;
	            }

	            int j = i + 1;
	            int k = nums.length - 1;

	            while (j < k) {
	                int sum = nums[i] + nums[j] + nums[k];

	                if (sum == 0) {
	                    // Found a triplet with zero sum
	                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

	                    // Skip duplicate elements for j
	                    while (j < k && nums[j] == nums[j + 1]) {
	                        j++;
	                    }

	                    // Skip duplicate elements for k
	                    while (j < k && nums[k] == nums[k - 1]) {
	                        k--;
	                    }

	                    // Move the pointers
	                    j++;
	                    k--;
	                } else if (sum < 0) {
	                    // Sum is less than zero, increment j to increase the sum
	                    j++;
	                } else {
	                    // Sum is greater than zero, decrement k to decrease the sum
	                    k--;
	                }
	            }
	        }
	        return ans;
	    }
}
