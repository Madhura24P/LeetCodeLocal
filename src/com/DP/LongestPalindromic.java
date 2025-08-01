package com.DP;

public class LongestPalindromic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="cbbd";
     System.out.println(longestPalindromeSubseq(s));
     
	}
	
	  public static int longestPalindromeSubseq(String s) {
		  
		  String s1=new StringBuilder(s).reverse().toString();
		  if(s.equals(s1))
		  {
			  return s.length();
		  }
		   int dp[][]=new int[s.length()+1][s1.length()+1];
		   
		   for(int i=1;i<=s.length();i++)
		   {
			   for(int j=1;j<=s1.length();j++)
			   {
				   if(s.charAt(i-1)==s1.charAt(j-1))
				   {
					   dp[i][j]=1+dp[i-1][j-1];
				   }else
				   {
					   dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				   }
			   }
		   }
			
	  return dp[s.length()][s1.length()];
	  }
	  
	  
	  //c0 b1 b2 d3 4
    //d0
	//b1   0  0  0  1
	//b2   0  1  1  1
	//c3   0  1  2  2
	//4    1  1  2  2
	  public static boolean check(String s)
	  {
		  int left=0;
		  int right=s.length()-1;
		  while(left<right)
		  {
			  if(s.charAt(right)!=s.charAt(left)) return false; 
			  left++;
			  right--;
		  }
		  return true;
	  }
}
