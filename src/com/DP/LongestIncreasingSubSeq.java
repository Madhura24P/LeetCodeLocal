package com.DP;

import java.util.Arrays;
import java.util.Map;

public class LongestIncreasingSubSeq {
	Map<Integer,Integer> countM;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,5,4,7};
		findNumberOfLIS(nums);

	}
	
public static int findNumberOfLIS(int[] nums) {
        

    int dp[] = new int[nums.length];
    int freq[] = new int[nums.length];
    
    Arrays.fill(dp , 1);
    Arrays.fill(freq,1);

    
    for(int i = 0 ; i<nums.length ; i++){

        for(int prev = 0 ; prev<= i-1 ; prev++){

           if(nums[i] > nums[prev] ){

                if(1+dp[prev] > dp[i]){
                    dp[i] = 1+dp[prev];
                    freq[i] = freq[prev];
                }
                else if((1+dp[prev]) == dp[i] ){
                    freq[i] = freq[i] + freq[prev];
                }
                
            }
        }
    }


   int maximum = -1 ;
    int index = -1 ;
    for(int i = 0 ; i<dp.length ; i++){
       if(maximum < dp[i]){
        maximum = dp[i];
        index = i;
       }
    }

    if(maximum == 1) return nums.length;



    int result = 0;
    for(int i = 0 ; i<dp.length ; i++){
        if(dp[i]==maximum){
            result = result+ freq[i];
        }
    }

    return result ;


    
}	
	
	


}
