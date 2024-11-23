package com.String;

public class FindLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfLastWord("Hello World");

	}
	
public static int lengthOfLastWord(String s) {
	
	//int count=0;
	
	s=s.trim();
	String []sArr=s.split(" ");
	 
	String lastWord=sArr[sArr.length-1];
	System.out.println(lastWord);
	
	
	return lastWord.length();
        
    }

}
