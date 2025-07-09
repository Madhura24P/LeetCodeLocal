package com.search;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MinDayMBouquets {

	public static void main(String[] args) {
		// TODO Auto3-generated method stub
		int n[]= {1,10,3,10,2};//min=1 max=10
		int m=3;
		int k=1;
		
		minDays(n, m, k);

	}
	
	 public static int minDays(int[] bloomDay, int m, int k) {
		 
		
		 if(bloomDay.length<(m*k))
		 {
			 return -1;
		 }
		 int min=Arrays.stream(bloomDay).min().getAsInt();
		 int max=Arrays.stream(bloomDay).max().getAsInt();
		 int start=min;
		 int end=max;
		 while(start<end)
		 {
			 int mid=(start+end)/2;
			 if(bloomDayCheck(bloomDay, mid, m, k)==true)
			 {
				 end=mid;
			 }else
			 {
				 start=mid+1;
			 }
			
		 }
		 
		 System.out.println(start);
	        return start;
	    }
	 
	 private static boolean bloomDayCheck(int[] bloomDay,int day,int m,int k)
	 {
		 int noOfB=0;
		 int count=0;
		 for(int i=0;i<bloomDay.length;i++)
		 {
			 if(bloomDay[i]<=day)
			 {
				 count++;
			 }else
			 {
				 noOfB=noOfB+(count/k);
				 count=0;
			 }
		 }
		 
		 noOfB=noOfB+(count/k);
		 
		 return noOfB==m?true:false;
	 }
	 
	 
	 boolean canMakeBouquets(int currentDay, int m, int k, int[] bloomDay) {
	        int flowersCount = 0;
	        int bouquetsMade = 0;

	        for (int day : bloomDay) {
	            if (day <= currentDay) {
	                flowersCount++;
	                if (flowersCount == k) {
	                    bouquetsMade++;
	                    flowersCount = 0;
	                    if (bouquetsMade == m) return true;
	                }
	            } else {
	                flowersCount = 0;
	            }
	        }
	        return false;
	    }

	    // Main function to find minimum days
	    public int minDaysOpt(int[] bloomDay, int m, int k) {
	        int n = bloomDay.length;
	        if ((long) m * k > n) return -1; // not enough flowers

	        int low = 1;
	        int high = 0;

	        for (int day : bloomDay) {
	            high = Math.max(high, day); // max bloom day
	        }

	        int ans = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (canMakeBouquets(mid, m, k, bloomDay)) {
	                ans = mid;
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	            }
	        }
	        return ans;
	    }

}
