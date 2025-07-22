package com.greedy;

import java.util.Arrays;

public class MinCostCandy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int minimumCost(int[] cost) {
		 
		 if(cost.length==1)
	        {
	            return cost[0];
	        }
	         Arrays.sort(cost);
			 int i=cost.length-1;
			 int costs=0;
			 
			 while(i>0)
			 {
				 costs=costs+cost[i]+cost[i-1];
				 i=i-3;			 
			 }
	         if(i==0)
	         {
	            costs=costs+cost[0];
	         }
			 
			 return costs;	        
	    }

}
