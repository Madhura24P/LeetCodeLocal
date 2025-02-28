package com.String;

public class PalinSubstring {
	int totalcount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int countSubstrings(String s) {
	for(int i=0;i<s.length();i++)
	{
		
	totalcount+=countHelper(s, i, i);
	totalcount+=countHelper(s, i, i+1);
	
	}
	
	return totalcount;
        
    }

public int countHelper(String s,int start,int end)
{
	int count=0;
	while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
	{
		count++;
		start--;
		end++;
	}
	return count;
	
}

}
