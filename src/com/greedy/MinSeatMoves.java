package com.greedy;

import java.util.Arrays;

public class MinSeatMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int minMovesToSeat(int[] seats, int[] students) {

	       Arrays.sort(seats);	
	       Arrays.sort(students);
	       
	       int s=0; int st=0; int moves=0;
	       while(s<seats.length)
	       {
	    	   moves=moves+Math.abs(seats[s]-students[st]);
	    	   s++;
	    	   st++;
	       }
	       
	       return moves;
	    }

}
