package com.greedy;

public class FillCups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int fillCups(int[] amount) {
        int mx = 0, sum = 0;
      for(int a: amount) {
          mx = Math.max(a, mx);
          sum += a;
      }
      return Math.max(mx, (sum + 1) / 2);
      
  }

}
