package com.DP;

public class LongestIdealSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		longestIdealString(s, 2);

	}
	
    public static int longestIdealString(String s, int k) {
        int n = s.length();// Initialize a dynamic programming array to store the intermediate values
        int[] dp = new int[27];
        for (int i = n-1; i >=0; i--) {
            char c=s.charAt(i);// Extract the character at the current index
            int idx=c-'a';
            int max = Integer.MIN_VALUE;

            int left=Math.max((idx-k),0);     // Calculate the left and right range for searching the maximum value
            int right=Math.min((idx+k),26);
            for (int j = left; j <=right; j++) { // Iterate through the range to find the maximum value among the dynamic programming values
               max=Math.max(max,dp[j]);
            }
            dp[idx]=max+1;    // Update the dynamic programming array at the index of the current character with the maximum value found plus 1
        }
        int max = Integer.MIN_VALUE;
        for(int element:dp)
        {
            max=Math.max(element,max); // Find the maximum value in the dynamic programming array
        }

        return max;
    }

	
	// a0 b1 c2 d3 4        s[0]-s[1]  i=1,j2
//a0
//b1      1  1  1  1
//c2      1  1  1  1     
//d3      1
//4

//abcd
//bcd res: a
//cd  res:ab
//d res:abc


}
