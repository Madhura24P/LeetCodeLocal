package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public int[][] merge(int[][] intervals) {
		 
		  List<int[]> l=new ArrayList<>();
		  Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
		  
		  int [] prev=intervals[0];

          if(intervals.length==1)
          {
            l.add(prev);
            return l.toArray(new int[l.size()][]);
          }
		  
		  for(int i=1;i<intervals.length;i++)
		  {
			  int [] curr=intervals[i];
			  if(prev[1]>=curr[0] )
			  {
                 int merge[]=new int [curr.length];
				  merge[0]=prev[0];
                  merge[1]=prev[1]<=curr[1]?curr[1]:prev[1];

				 // l.add(merge);
				  prev=merge;
			  }
              else
			  {
               
				 l.add(prev);
				  prev=curr;
			  }
			  
			 // l.add(prev);
		  }
		  
          l.add(prev);

		  return l.toArray(new int[l.size()][]);       
	    }
}
