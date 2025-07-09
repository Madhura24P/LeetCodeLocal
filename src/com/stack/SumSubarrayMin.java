package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class SumSubarrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 71,55,82,55};
		nextSmallerElement(arr);
		System.out.println("--------------------");
		prevSmallerElement(arr);
		System.out.println("--------------------");
		sumSubarrayMins(arr);
		

	}

	public static  int sumSubarrayMins(int[] arr) {

		int count = 0;

		int [] nse=nextSmallerElement(arr);
		int [] pse=prevSmallerElement(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			count=count+((nse[i]-i)*(i-pse[i]))*arr[i];//16*2=32
			//2,7; 2,7,8; 2,7,8,5;---3
			//2; 3,2; 7,3,2; 4,7,3,2;---4
			//4,7,3,2,7,8,5 ; 4,7,3,2,7,8 ; 4,7,3,2,7 ; ---3
			//7,3,2,7,8,5; 7,3,2,7,8; 7,3,2,7 ; ---3
			//3,2,7,8,5; 3,2,7,8 ; 3,2,7 ; ---3
			//====3+4+3+3+3 ~ 16 * 2(to get sum) 
			
			//i=0
		    //8*1*1(arr[0])=8
		    //1 ; 1,4 ; 1,4,7 ; 1,4,7,3 ; 1,4,7,3,2; 1,4,7,3,2,7 ; 1,4,7,3,2,7,8; 1,4,7,3,2,7,8,5
		}
		
	

		System.out.println(count);
		return count;

	}

	public static int[] nextSmallerElement(int[] arr) {
		Stack<Integer> st = new Stack();
		int res[] = new int[arr.length];
		Stack<Integer> stIndx=new Stack();
		int resIndx[]=new int[arr.length];
		// 1,4,6,7,3,7,8,1

		for (int i = arr.length - 1; i >= 0; i--) {
			if (st.isEmpty()) {
				st.push(arr[i]);
				res[i] = -1;
				stIndx.push(i);
				resIndx[i]=arr.length;
			} else {
				if (!st.isEmpty() && arr[i] > st.peek())

				{
					int temp = arr[i];
					res[i] = st.peek();
					resIndx[i]=stIndx.peek();
					st.push(temp);
					stIndx.push(i);
					

				} else {
					while (!st.isEmpty() && arr[i] <= st.peek()) {
						st.pop();
						stIndx.pop();
					}
					if (!st.isEmpty()) {
						int temp = arr[i];
						res[i] = st.peek();
						resIndx[i]=stIndx.peek();
						st.push(temp);
						stIndx.push(i);
					} else {
						st.push(arr[i]);
						stIndx.push(i);
						res[i] = -1;
						resIndx[i] =arr.length;
					}
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		System.out.println("##############################");
		System.out.println(Arrays.toString(resIndx));
		return resIndx;

	}

	public static int[] prevSmallerElement(int[] arr) {
		
		//1,4,3,7,8,5
	   //-1,1,1,3,7,38
		Stack<Integer> st = new Stack();
		int res[] = new int[arr.length];
		Stack<Integer> stIndx=new Stack();
		int resIndx[]=new int[arr.length];

		for (int i =0; i <arr.length; i++) {
			if (st.isEmpty()) {
				st.push(arr[i]);
				res[i] = -1;
				stIndx.push(i);
				resIndx[i]=-1;
			} else {
				if (!st.isEmpty() && arr[i] > st.peek())
				{
					int temp = arr[i];
					res[i] = st.peek();
					st.push(temp);
					resIndx[i]=stIndx.peek();
					stIndx.push(i);
					
				} else {
					while (!st.isEmpty() && arr[i] < st.peek()) {
						st.pop();
						stIndx.pop();
					}
					if (!st.isEmpty()) {
						int temp = arr[i];
						res[i] = st.peek();
						resIndx[i]=stIndx.peek();
						st.push(temp);
						stIndx.push(i);
						
						

					} else {
						st.push(arr[i]);
						stIndx.push(i);
						res[i] = -1;
						resIndx[i]=-1;
					}
				}
			}
		}
		

		
		System.out.println(Arrays.toString(resIndx));
		System.out.println("##############################");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
		
		return resIndx;

	}

    
	public int sumSubarrayMinsOpt(int[] arr) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            // use ">=" to deal with duplicate elements
            while (!stack.isEmpty() && stack.peek()[0] >= arr[i]) {
                stack.pop();
            }

            int j = stack.isEmpty() ? -1 : stack.peek()[1];
            res[i] = stack.isEmpty() ? arr[i] * (i + 1) : res[j] + arr[i] * (i - j);
            stack.push(new int[]{arr[i], i});
        }

        long MOD = (long) 1000000007;
        long ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = (ans + (long) res[i]) % MOD;
        }
        return (int) ans;        
    }

}
