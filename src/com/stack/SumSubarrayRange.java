package com.stack;

import java.util.Stack;

public class SumSubarrayRange {

	public static void main(String[] args) {
		int A[]= {4,1,3};//14
		//4 : 4-4=0   //1:1-1 = 0
		//4,1: 4-1=3  //1,3:3-1= 2
		//4,1,3:4-1 =3   //3:3-3= 0
		 
		subArrayRanges(A);
		

	}

	public static  long subArrayRanges(int[] A) {

		int n = A.length;
		int j, k = 0;
		long res = 0;
		Stack<Integer> s = new Stack<>();

		//Sum of mins of subarray
		for (int i = 0; i <= n; i++) {
			while (!s.isEmpty() && A[s.peek()] > (i == n ? Integer.MIN_VALUE : A[i])) {

				j = s.pop();
				k = s.isEmpty() ? -1 : s.peek();

				res -= (long) A[j] * (i - j) * (j - k);
			}

			s.push(i);
		}

		s.clear();

		//sum of max of subarray
		for (int i = 0; i <= n; i++) {
			while (!s.isEmpty() && A[s.peek()] < (i == n ? Integer.MAX_VALUE : A[i])) {

				j=s.pop();
				k=s.isEmpty()?-1:s.peek();
				
				res+=(long)A[j]*(i-j)*(j-k);
			}
			s.push(i);

		}
		
		System.out.println(res);
		return res;

	}

}
