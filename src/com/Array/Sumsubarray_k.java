package com.Array;

import java.util.HashMap;
import java.util.Map;

public class Sumsubarray_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {1};
		int k=0;
		
		subarraySum(nums, k);

	}
	
public static int subarraySum(int[] nums, int k) {
	
	Map<Integer,Integer> map=new HashMap<>();
	int sum=0;
	int bpt=0;
	//map.put(0, 0);
	
	for(int i=0;i<nums.length;i++)
	{
		sum=nums[i];
		bpt=i;
		while(bpt<nums.length)
		{
			if(bpt!=i)
			{
		 sum=sum+nums[bpt];
			}

		 if(map.containsKey(Math.abs(sum-k)))
		{
			map.put(Math.abs(sum-k), map.getOrDefault(Math.abs(sum-k), 0)+1);
		}
		else
		{
			map.put(Math.abs(sum-k), 1);
		}
		
		bpt++;
		}
		
	}
	
	
	
	int count=map.get(Integer.valueOf(0));
	System.out.println(count);
	return count;
        
    }


public int subarraySumOpt(int[] nums, int k) 
{
    HashMap<Integer, Integer> subNum = new HashMap<>();
    subNum.put(0, 1);
    int total = 0, count = 0;

    for (int n : nums) {
        total += n;

        if (subNum.containsKey(total - k)) {
            count += subNum.get(total - k);
        }

        subNum.put(total, subNum.getOrDefault(total, 0) + 1);
    }

    return count;        
}

}
