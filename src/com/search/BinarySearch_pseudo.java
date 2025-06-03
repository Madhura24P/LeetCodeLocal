package com.search;

public class BinarySearch_pseudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Iterative approach
		
		}

		public static int iterativeBinarySearch()
		{
			int n=0;//size of arr
			int target=0;
			int low=0,high=n-1;
			
			while(low<=high)
			{
				int mid=low+(high-low)/2;
				
				if(mid==target)
				{
					return mid;
				}else if(target>mid)
				{
					low=mid+1;
				}else
				{
					high=mid-1;
				}
			
		}
			return -1;
	}
		
		public static int recursiveBinarySearch(int [] arr,int low,int high,int target)
		{
			if(low>high) return -1;
				int mid=(low+(high-low))/2;
				
				if(mid==target)
				{
					return mid;
				}else if(target>mid)
				{
					low=mid+1;
					return recursiveBinarySearch(arr, low, high, target);
				}else
				{
					high=mid-1;
					return recursiveBinarySearch(arr, low, high, target);
				}
	}

}
