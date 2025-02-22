package com.Array;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MaxProductSubArray9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {-3,-1,-1};
		maxProduct(nums);
		
		
		List<Integer> l=Arrays.asList(1,2,3);
		String s=l.stream().map(e->String.valueOf(e)).collect(Collectors.joining(","));
		Stack<Integer> st=new Stack();
		

	}
	
	 public static int maxProduct(int[] nums) {
		 
	        int n = nums.length;
	        int l=1,r=1;
	        int ans=nums[0];
	        
	        for(int i=0;i<n;i++){
	            
				//if any of l or r become 0 then update it to 1
	            l = l==0 ? 1 : l;
	            r = r==0 ? 1 : r;
	            
	            l *= nums[i];   //prefix product
	            r *= nums[n-1-i];    //suffix product
	            
	            ans = Math.max(ans,Math.max(l,r));
	            
	        }
	        
	        return ans;
	    }

}
