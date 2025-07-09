package com.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {0,1,2,2};
		totalFruit(nums);
		

	}
	
public static  int totalFruit(int[] fruits) {
	
	int l=0,r=0;
	int maxlen=0;
	int n=fruits.length;
	Map<Integer,Integer> freqMap=new HashMap<>();
	
	while(r<n)
	{
		freqMap.put(fruits[r], freqMap.getOrDefault(fruits[r], 0)+1);
		
		if(freqMap.size()>2)
		{
			while(freqMap.size()>2)
			{
				freqMap.put(fruits[l], freqMap.get(fruits[l])-1);
				
				if(freqMap.get(fruits[l])==0)
				{
					freqMap.remove(fruits[l]);
				}
				l++;
			}
			
		}
		
		maxlen=Math.max(maxlen, (r-l+1));
		r++;
		
	}
	
	return maxlen;
        
    }

}
