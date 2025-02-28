package com.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrefCommonArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,3,2,4};
		int B[]= {3,1,2,4};
		findThePrefixCommonArray(A, B);

	}
	
	 public static int[] findThePrefixCommonArray(int[] A, int[] B) {
		 
		 int res[]=new int[A.length];
		 
		 Map<Integer,List<Integer>> mapA=new HashMap<>();
		 List<Integer> listA=Arrays.stream(A).boxed().collect(Collectors.toList());
		 for(int i=0;i<A.length;i++)
		 {
			 mapA.put(i, listA.subList(0, i+1));
		 }
		 
		 Map<Integer,List<Integer>> mapB=new HashMap<>();
		 List<Integer> listB=Arrays.stream(B).boxed().collect(Collectors.toList());
		 for(int i=0;i<B.length;i++)
		 {
			 mapB.put(i, listB.subList(0, i+1));
		 }
		
		System.out.println(mapA); 
		System.out.println(mapB);
		
		mapA.entrySet().stream().forEach(x-> {
			
			List<Integer> Al=x.getValue();
			List<Integer> Bl=mapB.get(x.getKey());
			int count=0;
			for(int a:Al)
			{
				if(Bl.contains(a))
				{
					count++;
				}
			}
			res[x.getKey()]=count;
			
		});
		
		System.out.println(Arrays.toString(res));
		 return res;
	    }
	 
	 public int[] findThePrefixCommonArrayOpt6(int[] A, int[] B) {
	        int n = A.length;
	        int[] result = new int[n];
	        int[] count = new int[n + 1];
	        int common = 0;
	        
	        for(int i = 0; i < n; i++) {
	            count[A[i]]++;
	            if(count[A[i]] == 2) common++;
	            count[B[i]]++;
	            if(count[B[i]] == 2) common++;
	            result[i] = common;
	        }
	        return result;
	    }
	 

}
