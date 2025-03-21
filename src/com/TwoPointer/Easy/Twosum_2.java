package com.TwoPointer.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Twosum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int[] twoSum(int[] numbers, int target) {
	
	Map<Integer,Integer> mapNum=new HashMap<>();
	int apt=0;
	List<Integer> res=new ArrayList<>();
	
	
	
	for(int n:numbers)
	{
		
		if(target-n>n)
		{
			mapNum.put(target-n, apt+1);
		}else if(mapNum.containsKey(n))
		{
			res.add(mapNum.get(n));
			res.add(apt+1);
		}
		
		apt++;
	}
	
	return res.stream().mapToInt(x->x).toArray();
        
    }


public int[] opt(int[] numbers,int target)
{
	 int left = 0;
     int right = numbers.length - 1;

     while (left < right) {
         int total = numbers[left] + numbers[right];

         if (total == target) {
             return new int[]{left + 1, right + 1};
         } else if (total > target) {
             right--;
         } else {
             left++;
         }
     }
     return new int[]{-1, -1}; 
}

}
