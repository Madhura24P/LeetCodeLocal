package com.Array;

import java.util.*;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n= {{1,3},{6,9}};
		int n1[]= {2,5};
		insert(n, n1);

	}
	
	 public static int[][] insert(int[][] intervals, int[] newInterval) {
		 List<int[]> l=new ArrayList<>();
		
		 int [][] up_int=Arrays.copyOf(intervals, intervals.length+1);
		 up_int[up_int.length-1]=newInterval;
		 
		 Arrays.sort(up_int,(a,b)->Integer.compare(a[0], b[0]));
		 
		 int prev[]=up_int[0];
		 
		 for(int i=1;i<up_int.length;i++)
		 {
			 if(prev[1]<=up_int[i][0])
			 {
				 int merge[]=new int[prev.length];
				 merge[0]=prev[0]<=up_int[i][0]?prev[0]:up_int[i][0];
				 merge[1]=prev[1]>=up_int[i][1]?prev[1]:up_int[i][1];
				 l.add(merge);
				 prev=merge;
			 }else
			 {
				 l.add(prev);
				 prev=up_int[i];
			 }
		 }
		 
		 l.add(prev);
		 
		 return l.toArray(new int[l.size()][]);
	        
	    }

}
