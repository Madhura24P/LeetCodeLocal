package com.Array;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class MaxTruckUnits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] n= {{1,3},{2,2},{3,1}};
		int n[][]= {{2,1},{4,4},{3,1},{4,1},{2,4},{3,4},{1,3},{4,3},{5,3},{5,3}};

		maximumUnits(n, 13);


	}
	
	 public static int maximumUnits(int[][] boxTypes, int truckSize) {
	      int currSize[]=new int[boxTypes.length];
	      int Tsize=truckSize;
	      int total=0;
	     // Map<Integer,Integer> map=new HashMap<>();
	      
			/*
			 * for(int i=0;i<boxTypes.length;i++) { if(Tsize>0) { if(Tsize<boxTypes[i][0]) {
			 * currSize[i]=(Tsize)*boxTypes[i][1]; // Tsize=boxTypes[i][0]-Tsize;
			 * total=total+currSize[i]; }else { currSize[i]=boxTypes[i][0]*boxTypes[i][1];
			 * Tsize=Tsize-boxTypes[i][0]; total=total+currSize[i]; } }
			 * 
			 * } System.out.println(total); return total;
			 */
	    
			/*
			 * for(int i=0;i<boxTypes.length;i++) { map.put(boxTypes[i][1], boxTypes[i][0]);
			 * }
			 * 
			 * List<Integer> l=
			 * map.keySet().stream().sorted(Comparator.reverseOrder()).collect(Collectors.
			 * toList());
			 * 
			 * for(int n:l) { if(Tsize>map.get(n)) { total=total+(n*map.get(n));
			 * Tsize=Tsize-map.get(n); }else { total= total+(Tsize*n); break; } }
			 * 
			 * return total;
			 */
	      
	  // Arrays.sort(boxTypes, Comparator.comparingInt(o->-o[1]));
	      Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
		int ans = 0, i = 0, n = boxTypes.length;
		while (i < n && truckSize > 0) {
			int maxi = Math.min(boxTypes[i][0], truckSize);
			ans += maxi * boxTypes[i][1];
			i++;
			truckSize -= maxi;
		}
		return ans;
	   
	    }

}
