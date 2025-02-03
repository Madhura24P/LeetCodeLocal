package com.TwoPointer.Easy;

public class FindFirstOccurance {
	
	public static void main(String[] args) {
		
		System.out.println(strStr("butsadhi","sad"));
	}
	
	
	
	
public static int strStr(String haystack, String needle) {
	
	//1. Define pointer 
	int b_pointer=0;
	
	//2. iterate by calculating length diff
	for(int i=0;i<=haystack.length()-needle.length();i++)
	{
	
		if(haystack.charAt(i)==needle.charAt(b_pointer))
		{66
			
			while(b_pointer<needle.length())
			{
				if(haystack.charAt(i+b_pointer)==needle.charAt(b_pointer))
				{
					b_pointer++;
				}
				else
				{
					break;
				}
				
			}
			if(b_pointer==needle.length())
			{
			    return i;	
			}
			else
			{
				b_pointer=0;
			}
		
			
		}
		
	}
	
	return -1;
        
    }

}
