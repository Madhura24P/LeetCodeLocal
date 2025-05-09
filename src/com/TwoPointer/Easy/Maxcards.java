package com.TwoPointer.Easy;

public class Maxcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int nums[]= {2,2,2};
 maxScore(nums, 2);
 
 
 
	}
	
	 public static int maxScore(int[] cardPoints, int k)  {
			          
					 int apt=0;
					 int bpt=cardPoints.length-1;
					 int tot=0;
					 while(k>0 )
					 {

						 if(cardPoints[apt]==cardPoints[bpt])
						 {
							 tot=tot+cardPoints[apt];
							 apt++;
							 bpt--;
						 }else
						 {
							 
						 tot=tot+Math.max(cardPoints[apt], cardPoints[bpt]);
						 
						 if(cardPoints[apt]<cardPoints[bpt])
						 {
							 bpt--;
						 }else if(cardPoints[apt]>cardPoints[bpt])
						 {
							 apt++;
						 }
						 }
						 k--;
						 
					 }
					 
					 return tot;

			    }
			    
			    public int maxScor4Opt(int[] cardPoints, int k) {
			         int i = 0; // Pointer for the start of the array
			        int ans = Integer.MIN_VALUE; // To store the maximum sum
			        int sum = 0; // To calculate the sum of the chosen elements
			        int n = cardPoints.length;

			        // Base case: If k equals the size of the array, return the total sum
			        if (n == k) {
			            for (int j = 0; j < n; ++j) {
			                sum += cardPoints[j];
			            }
			            return sum;
			        }

			        // Step 1: Calculate the sum of the first k elements
			        while (i < k) {
			            sum += cardPoints[i];
			            ++i;
			        }

			        // Initialize the maximum sum
			        ans = Math.max(ans, sum);

			        // Step 2: Sliding window - replace elements from the prefix with suffix
			        k = k - 1; // Adjust `k` for iterations
			        while (k >= 0) {
			            sum = sum - cardPoints[k] + cardPoints[--n]; // Adjust the sum
			            ans = Math.max(ans, sum); // Update the maximum sum
			            --k;
			        }

			        return ans; 
					 
			    }
			
	        
	    }


