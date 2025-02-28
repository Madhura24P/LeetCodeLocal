package com.Array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DisappearingNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,1};
		findDisappearedNumbers(nums);

	}
	
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	     List<Integer> res=new ArrayList<>(); 
	     Arrays.sort(nums);
	     int []numsCp=new int[nums.length+1];
	     int i=0;
	     while(i<nums.length )
	     {
	    	numsCp[nums[i]]++; 
	    	i++;
	     }
	     
	     //System.out.println(Arrays.toString(numsCp));
	     
	     for(int j=1;j<numsCp.length;j++)
	     {
	    	 if(numsCp[j]==0)
	    	 {
	    		 res.add(j);
	    	 }
	     }
	     
	     //System.out.println(res);
	     return res;
		 
	    }
	 
	 
	 public void findNum_java8(int num[])
	 {
		 List<Integer> res=new ArrayList<>();
		 List<Integer> listNum=Arrays.stream(num).boxed().toList();
	     Map<Integer,Long> mapNum=listNum.stream().sorted().
	    		 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));	
	     
	     int len=num.length;
	     
	     for(int i=1;i<=len;i++)
	     {
	    	 if(!mapNum.containsKey(i))
	    	 {
	    		 res.add(i);
	    	 }
	     }
	     
	     
	     
	 
	 }

}
