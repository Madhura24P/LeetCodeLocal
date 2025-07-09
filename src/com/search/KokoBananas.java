package com.search;

import java.util.Arrays;

public class KokoBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int piles[]= {805306368,805306368,805306368};
		int h=1000000000;
		
		minEatingSpeed(piles, h);
		

	}

	
	public static int minEatingSpeed(int  piles[],int h) {
     int n = piles.length;
     if (h < n) {
         return -1; // If hours are less than number of piles, it's impossible
     }

     // Binary search between 1 and the max pile
     int left = 1, right = findMax(piles);

     while (left < right) {
         int mid = left + (right - left) / 2; // Avoid overflow

         int hoursNeeded = getHoursNeeded(piles, mid);

         if (hoursNeeded <= h) {
             // Try a smaller speed (see if there's a lower valid one)
             right = mid;
         } else {
             // Not enough time, need to eat faster
             left = mid + 1;
         }
     }

     return left; // The smallest possible speed to finish in h hours
 }

 // Function to find the maximum element in the array
 private static int findMax(int[] piles) {
     int max = piles[0];
     for (int i = 1; i < piles.length; i++) {
         if (piles[i] > max) {
             max = piles[i];
         }
     }
     return max;
 }

 // Helper function to calculate total hours needed at a given speed
 private static int getHoursNeeded(int[] piles, int speed) {
     int hours = 0;
     for (int pile : piles) {
         // Equivalent to Math.ceil((double)pile / speed)
         hours += (pile + speed - 1) / speed;
     }
     return hours;
 }


}
