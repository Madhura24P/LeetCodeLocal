package com.bitManipulation;

import java.util.stream.IntStream;

public class MinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10;
		int goal=7;
		
		
		int ans =start ^ goal;
		int count=0;
		for(int i=0;i<32;i++)
		{
			if((ans & (1<<i))==1)
			{
				count++;
			}
			
		}
		
		System.out.println(count);

	}
	
	public int minBitFlips(int start, int goal) {
	      int ans=0;
			int xor =start ^ goal;
			//int count=0;
			 while(xor!=0){
	            // If the last bit is 1, increment count 
	            ans += xor & 1;

	            // Right-shift to check the next bit
	            xor >>=1;
	         }
			
			System.out.println(ans);
	        return ans;
	         
	        
	    }

}
