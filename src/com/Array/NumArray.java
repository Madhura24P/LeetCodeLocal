package com.Array;

public class NumArray {

	    public int[] sumArr;
	    public int[] nums;

	    public NumArray(int[] nums) {
	        this.nums = nums;
	        this.sumArr = new int[nums.length];
	        sumArr[0] = nums[0];
	        for (int i=1; i<nums.length; i++) {
	            sumArr[i] = sumArr[i-1] + nums[i];
	        }
	    }

	    public int sumRange(int left, int right) {
	        return sumArr[right] - sumArr[left] + nums[left];
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

}
