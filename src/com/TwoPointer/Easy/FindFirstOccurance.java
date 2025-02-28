package com.TwoPointer.Easy;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
		{
			
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


public void firstOcc(String hay,String needle)
{
	
	OptionalInt indexOpt = IntStream.range(0, hay.length() - needle.length() + 1)
            .filter(i -> hay.substring(i, i + needle.length()).equals(needle))
            .findFirst();
if (indexOpt.isPresent()) {
System.out.println("First occurrence of substring is at index: " + indexOpt.getAsInt());
} else {
System.out.println("Substring not found.");
}
	
}

}
