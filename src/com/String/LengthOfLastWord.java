package com.String;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLastWord(String s) {
	    s=s.trim();
		String []sArr=s.split(" ");
		 
		String lastWord=sArr[sArr.length-1];
	    return lastWord.length();

	    }
}
