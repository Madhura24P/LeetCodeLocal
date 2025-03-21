package com.KthSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KthClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[]= {1,1,1,10,10,10};
		int k=1;
		int x=9;*/
		
		/*
		 * int arr[]= {1,1,2,3,4,5}; int k=4; int x=3;
		 */	
		
		/*
		 * int arr[]= {1,2,3,4,5}; int k=4; int x=3;
		 */
		
		int arr[]= {1,1,2,2,2,2,2,3,3,};
		int k=3;
		int x=3;
		
		findClosestElements(arr, k, x);

	}
	
	 public static List<Integer> findClosestElements(int[] arr, int k, int x) {
		 
		 List<Integer> res=new ArrayList<>();
		 
		 List<Integer> arrlist=Arrays.stream(arr).boxed().toList();
		 
		 Map<Integer,Integer> closeMap=new HashMap<>();
		 
		arrlist.stream().forEach(n->{
			closeMap.put(n, Math.abs(n-x));
		});
		
		Map<Integer,Integer> sortMap=closeMap.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().
				thenComparing(Map.Entry.comparingByKey()))
		       .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

		System.out.println(sortMap);
		
		sortMap.entrySet().stream().limit(k).forEach(e-> {
		    	   if(res.size()<k)
		    	   {
		    		   int freq=Collections.frequency(arrlist, e.getKey());
		    		   int f=0;
		    		   while(f<freq && res.size()<k)
		    		   {
		    		   res.add(e.getKey());
		    		   f++;
		    		   }
		    		   
		    	   }
		       });
		
		System.out.println(res.stream().sorted().limit(k).toList());
		
		;
		 
		 
		 
		 return res;
	        
	    }

	 
	 public List<Integer> opt(int arr[],int k,int x)
	 {
		  int start = 0;
	        int end = arr.length - 1;
	        while (end - start >= k) {
	            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
	                start++;
	            } else {
	                end--;
	            }
	        }

	        List<Integer> result = new ArrayList<>(k);
	        for (int i = start; i <= end; i++) {
	            result.add(arr[i]);
	        }
	        return result;
	 }
	 
}


