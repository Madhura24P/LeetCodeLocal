package com.greedy;

import java.util.Arrays;

public class MaxTrainersPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int matchPlayersAndTrainers(int[] players, int[] trainers) {
       
		 Arrays.sort(trainers);
		 Arrays.sort(players);
		 
		 int p=0;int t=0;
		 int count=0;
		 
		 while(t<trainers.length && p<players.length)
		 {
			 if(players[p]<=trainers[t])
			 {
				 count++;
				 p++;
			 }
			 t++;
		 }
	        
		 return count;
	    }

}
