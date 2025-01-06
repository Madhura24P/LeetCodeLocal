package com.String;

public class PalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(121);

	}
	
public static boolean isPalindrome(int x) {
	boolean flag=false;
	int res=0;
	int num=x;
	
	while(x>res)
	{
		res=10*res+(x%10);
		x=x/10;
		
	}
	
	if (res==x || x==res/10)
	{
		flag=true;
	}
	
	System.out.println(res+":"+flag);
	return flag;
        
    }

}
