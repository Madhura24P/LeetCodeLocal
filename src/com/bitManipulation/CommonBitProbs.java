package com.bitManipulation;

public class CommonBitProbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operators:
		//& And , | OR , ~ Not , ^ xor 
		
		//swap with out using temp
		int a=7;
		int b=8;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+"+"+b);
		
		//Extract ith bit:
		//left operator
		
		int n=13;
		int i=2;
		boolean flag=(n & (1<<i))!=0; //true if bit set else false
		
		//right opertaor
		boolean flg_right=((n>>i)&1)==0; //true if bit not set else false
		
		//Set ith bit
		//N | (1<<i)
		
		//Clear ith bit
		// N & ~ (1<<i)
		
		//Toggle ith bit
		//N ^ (1<<i)
		
		//remove last set bit
		//n & n-1
		
		//n right shift is 
		//n / 2 power of k eg 13/2^1=6 which is == 13>>1
		
		// n left shift is
		// n* 2^k
		
		//check if num is power of 2;
		//n&n-1 ==0 
		
		//count number of set bits
		//n>>1 & 1 for 32 times to get count

	}

}
