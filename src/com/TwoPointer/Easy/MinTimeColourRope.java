package com.TwoPointer.Easy;

public class MinTimeColourRope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int minCost(String colours,int[] neededTime)
	{
		int time=0;
		for(int i=0;i<colours.length()-1;i++)
		{
			if(colours.charAt(i)==colours.charAt(i+1))
			{
				if(neededTime[i]<neededTime[i+1])
				{
					time+=neededTime[i];
				}else
				{
					time+=neededTime[i+1];
					neededTime[i+1]=neededTime[i];
				}
			}
		}
		
		
		return time;
	}

}
