package com.Array;

public class SumOddLengh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,4,2,5,3};
		//1+2+3+6=12
		sumOddLengthSubarrays(nums);

	}
	
	public static int sumOddLengthSubarrays(int[] arr) {
    int sum=0;
        int a_pointer=0;
        int b_pointer=0;
      while(a_pointer<arr.length)
        {
        	while((b_pointer+a_pointer+1)%2!=0 && b_pointer<arr.length)
        	{
        		for(int i=a_pointer;i<=b_pointer;i++)
        		{
        			sum=sum+arr[i];
        			//System.out.println(sum);
        		}
      		b_pointer=b_pointer+2;
        	}
         
        	a_pointer=a_pointer+1;
        	b_pointer=a_pointer;
        		
        	
        
        }
     //5 System.out.println("final:"+sum);
        
        
        
        return sum;
        
        
    }

}
