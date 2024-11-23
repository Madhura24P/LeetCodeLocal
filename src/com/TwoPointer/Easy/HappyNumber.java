package com.TwoPointer.Easy;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));

	}
	
	public static boolean isHappy(int n) {

//define slow and fast pointer
int slow=getNextNumber(n);
int fast=getNextNumber(getNextNumber(n));

//Iterate till slow not equals fast as that would be cycle repeat
  while(slow!=fast)
  {
	  if(fast==1) return true;
	  slow=getNextNumber(slow);
	  fast=getNextNumber(getNextNumber(fast));
	  
	  
  }


return false;
        
    }
	
	
	public static int getNextNumber(int n)
	{
		int output=0;
		while(n>0)
		{
			int digit=n%10;
			output+=digit*digit;
			n=n/10;
		}
		
		return output;
	}

}
