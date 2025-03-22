package com.String;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String reverseOnlyLetters(String s) {
		 
		 StringBuilder ans=new StringBuilder();
		 int bPt=s.length()-1;
		 int aPt=0;
		 
		while(aPt<s.length())
		 {
			if(Character.isLetter(s.charAt(aPt)) 
					&& Character.isLetter(s.charAt(bPt)))
			{
				ans.append(s.charAt(bPt));
				aPt++;
				bPt--;
			}
			else if(!Character.isLetter(s.charAt(aPt)))
			{
				ans.append(s.charAt(aPt));
				aPt++;
			}else if(!Character.isLetter(s.charAt(bPt)))
			{
				bPt--;
			}
			 
			 
		 }
		 
		 return ans.toString();
	        
	    }

}
