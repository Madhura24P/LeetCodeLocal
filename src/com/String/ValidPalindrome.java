package com.String;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static boolean isPalindrome(String s) {
	
	boolean flag=true;
	
	String newStr="";
	for(char c:s.toCharArray())
	{
		if(Character.isDigit(c) || Character.isLetter(c))
		{
			newStr+=c;
		}
	}
	
	newStr=newStr.toLowerCase();
	
	int aPt=0;
	int bPt=newStr.length()-1;
	
	while(aPt<=bPt)
	{
		if(newStr.charAt(aPt)!=newStr.charAt(bPt))
		{
			flag=false;
			break;
		}
		aPt++;
		bPt--;
	}
	
	return flag;
        
    }

public boolean isPalindromeOptimized(String s) {
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;        
}

}
