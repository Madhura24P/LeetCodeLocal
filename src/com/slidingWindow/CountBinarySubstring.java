package com.slidingWindow;

public class CountBinarySubstring {
	
	public static void main(String[] args) {
		String s="00110011";
		countBinarySubstrings(s);
	}
	
public static int countBinarySubstrings(String s) {
	
	 int prevRunLength = 0, curRunLength = 1, ans=0;
     for (int i = 1; i < s.length(); i++) {
         if (s.charAt(i) == s.charAt(i-1)) {
             curRunLength++;
         } else {
             prevRunLength = curRunLength;
             curRunLength=1;
         }
         if (prevRunLength >= curRunLength) {
             ans++;
         }
     }
     return ans;
    }

}
