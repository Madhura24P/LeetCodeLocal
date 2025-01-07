package com.Array;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int addDigits(int num) {
	
	while((num/10)!=0)
	{
	   num=sum(num);	
	}
	
	return num;
        
    }

private static int sum(int n)
{
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		sum+=r;
		n=n/10;
	}
	
	return sum;
}

}
