package com.mergeIntervals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
		 
		 Map<Integer,Integer> map=new HashMap<>();
		 int n1=nums1.length;
		 int n2=nums2.length;
		 
		 List<int[]> listnum1=Arrays.stream(nums1).collect(Collectors.toList());
		 List<int[]> listnum2=Arrays.stream(nums2).collect(Collectors.toList());
		 
		 listnum1.stream().forEach(x -> {
		  map.put(x[0], x[1]);
			 
		 });
		 
		 listnum2.stream().forEach(y ->
		 {
			 if(map.containsKey(y[0]))
			 {
				 int val=map.get(y[0])+y[1];
				 map.put(y[0],val);
				 
			 }else
			 {
				 map.put(y[0], y[1]);
			 }
		 });
		 
		 map.entrySet().stream().
		 forEach(x -> System.out.println(x.getKey()+":"+x.getValue()));
		 
		 
		 List<Entry<Integer, Integer>> res=map.entrySet().stream().collect(Collectors.toList());
		 
		 int[][] resArr=new int[res.size()][];
		 for(int i=0;i<resArr.length;i++)
		 {
			 resArr[i]= new int[]{res.get(i).getKey(),res.get(i).getValue()};
		 }
		 
		 
		 return resArr;
		 
	        
	    }

}
