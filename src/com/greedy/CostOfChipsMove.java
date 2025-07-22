package com.greedy;

public class CostOfChipsMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int minCostToMoveChips(int[] position) {
         int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
        
    }

}
