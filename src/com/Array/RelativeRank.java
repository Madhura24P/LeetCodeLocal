package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sc= {5,4,3,2,1};
		findRelativeRanks(sc);

	}
	
	 public static String[] findRelativeRanks(int[] score) {
		 
		 int n = score.length;
	        
	        int[][] sortedPairs = new int[n][2];
	        for (int i = 0 ; i < n ; i++) sortedPairs[i] = new int[] {i, score[i]};
	        
	        Arrays.sort(sortedPairs, (x, y) -> (y[1] - x[1]));
	        
	        String[] ans = new String[n];
	        
	        for (int i = 0 ; i < n ; i++) {
	            
	            if (i == 0) {
	                ans[sortedPairs[i][0]] = "Gold Medal";
	            } else if (i == 1) {
	               ans[sortedPairs[i][0]] = "Silver Medal";
	            } else if (i == 2) {
	                ans[sortedPairs[i][0]] = "Bronze Medal";
	            } else {
	                ans[sortedPairs[i][0]] = String.valueOf(i+1);
	            }
	        }
	        
	        return ans;
	        
	    }



public String[] sol2(int[] score)
{
	   // Create an array to store the final result (rewards or ranks)
    String[] reward = new String[score.length];

    // Convert the int[] array to a List<Integer> so we can use indexOf() method
    List<Integer> list = new ArrayList<>();
    for (int val : score) {
        list.add(val);
    }

    // Sort the list in descending order (highest score comes first)
    Collections.sort(list, Collections.reverseOrder());

    // Loop through the original scores
    for (int i = 0; i < score.length; i++) {
        // Get the rank (index in the sorted list)
        int index = list.indexOf(score[i]);

        // Assign medals to top 3 ranks, and numeric ranks to others
        switch (index) {
            case 0:
                reward[i] = "Gold Medal";
                break;
            case 1:
                reward[i] = "Silver Medal";
                break;
            case 2:
                reward[i] = "Bronze Medal";
                break;
            default:
                reward[i] = String.valueOf(index + 1); // Convert rank (index + 1) to string
        }
    }

    // Return the array with rewards/ranks
    return reward;
}

}
