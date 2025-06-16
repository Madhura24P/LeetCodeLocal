package com.TwoPointer.Easy;

import java.util.Arrays;

public class BoatsToSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int numRescueBoats(int[] people, int limit) {
	
	int left=0;
	int right=people.length-1;
	int boat=0;
	Arrays.sort(people);
	
	while(left<=right)
	{
		if(people[left]+people[right]<=limit)
		{
			left++;
			right--;
			boat++;
		}else
		{
			right--;
			boat++;
			
		}
		
	}
        
	return boat;
    }

}
