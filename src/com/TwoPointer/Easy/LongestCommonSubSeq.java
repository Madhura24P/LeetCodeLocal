package com.TwoPointer.Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LongestCommonSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int longestCommonSubsequence(String text1, String text2) {
		 
		 int apt=0;
		 int bpt=0;
		 String s1;
		 String s2;
		 List<Integer> list=new ArrayList<>();
		 if(text1.length()>text2.length())
		 {
			  s1=text1;
			  s2=text2;
		 }else
		 {
			 s2=text1;
			 s1=text2;

		 }
		 
		 List<String> res=new ArrayList<>();
		 
		 for(int i=0;i<s1.length();i++)
		 {
			 int len=0;
			 apt=i;
			 bpt=0;
			 while(apt<s2.length() && apt<s1.length())
			 {
				 if(s1.charAt(apt)==s2.charAt(bpt))
				 {
					 len++;
					 bpt++;
				 }
				 apt++;
				 
			 }
			 
			 list.add(len);
			 
		 }
		 
		 return list.stream().max(Comparator.naturalOrder()).get();
	        
	    }
	 
	 
	 public int longestCommonSubsequenceOpt(String text1, String text2) {
		 int len1=text1.length();
		 int len2=text2.length();
		 if(text1.equals(text2))
		 {
			 return len1;
		 }
		 
		 int[][] dp=new int[len1+1][len2+1];
		 for(int i=1;i<=len1;i++)
		 {
			 for(int j=1;j<=len2;j++)
			 {
				 if(text1.charAt(i-1)==text2.charAt(j-1))
				 {
					 dp[i][j]=1+dp[i-1][j-1];
				 }else
				 {
					 dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				 }
			 }
		 }
	        return dp[len1][len2];
	    }

}
