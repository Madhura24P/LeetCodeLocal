package com.search;

import java.util.Arrays;

public class CapacityShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int shipWithinDays(int[] weights, int days) {
	
	int max=Arrays.stream(weights).max().getAsInt();
	int sum=Arrays.stream(weights).sum();
	int ans=0;
	
	int low=max;
	int high=sum;
	
	while(low<=high)
	{
		int mid=low+(high-low)/2;
		if(daysReq(weights, mid)<=days)
		{
			ans=mid;
			high=mid-1;
		}else
		{
			low=mid+1;
		}
	}
	
	return ans;
        
    }

private int daysReq(int[] weights,int capacity)
{
	int load=0; int days=1;
	for(int i=0;i<weights.length;i++)
	{
		if(load+weights[i]>capacity)
		{
			days++;
			load=weights[i];
		}else
		{
			load=load+weights[i];
		}
	}
	
	return days;
	
}

}
