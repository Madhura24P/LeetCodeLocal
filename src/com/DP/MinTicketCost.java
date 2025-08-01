package com.DP;

import java.util.Arrays;

public class MinTicketCost {
	int dp[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days[]= {1,4,6,7,8,20};
		int costs[]= {2,7,15};
		//mincostTickets(days, costs);

	}
	
	 public  int mincostTickets(int[] days, int[] costs) {
		 
		 int n=days.length;
		 dp = new int[n];
	     Arrays.fill(dp, -1);
		 int cost=solve(days,costs,n,0);
		 return cost;
		 
	        
	    }
	 
	 public  int solve(int[] days,int[] costs,int n,int inx)
	 {
		 if(inx>=n)
		 {
			 return 0;
		 }
		 
		 if (dp[inx] != -1) {
	            return dp[inx];
	        }
		 
		 //1 day pass
		 int cost1=costs[0]+solve(days,costs,n,inx+1);
		
		//7 day pass
		 int j=inx;
		 int max_day=days[j]+7;
		 while(j<n && days[j]<max_day)
		 {
			 j++;
		 }
		 int cost2=costs[1]+solve(days,costs,n,j);
		 
		//30 day pass
		 j=inx;
		 max_day=days[j]+30;
		 while(j<n && days[j]<max_day)
		 {
			 j++;
		 }
		 int cost3=costs[2]+solve(days,costs,n,j);
		 
		 int mincost= cost1<cost2?cost1<cost3?cost1:cost3:cost2<cost3?cost2:cost3;

         return dp[inx]=mincost;		 
		 
	 }

}
