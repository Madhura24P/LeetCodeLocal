package com.TwoPointer.Easy;

import java.util.Arrays;

public class SortArrayParity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {4,2,5,7};
		sortArrayByParityII(nums);

	}
	
public static int[] sortArrayByParityII(int[] nums) {
	
	int j=0;
	for(int i=0;i<nums.length;i++)
	{
		   if(i%2==0 && nums[i]%2!=0)
		   {
			   j=i+1;
			   while(nums[j]%2!=0)
			   {
				   j++;
			   }
			   
			   int temp=nums[j];
			   nums[j]=nums[i];
			   nums[i]=temp;
		   }
		   else if(i%2!=0 && nums[i]%2==0)
		   {
			   j=i+1;
			   while(nums[j]%2==0)
			   {
				   j++;
			   }
			   
			   int temp=nums[j];
			   nums[j]=nums[i];
			   nums[i]=temp;

			   
		   }
		
	}
	System.out.println(Arrays.toString(nums));
        return nums;
    }


public int[] sortArrayByParityIIOpt(int[] nums) {
    
    int e = 0;
    int o = 1;
    int n = nums.length;
  while (e < n && o < n) {
        if (nums[e] % 2 == 0) {
            e += 2;
        } else if (nums[o] % 2 == 1) {
            o += 2;
        } else {
            // nums[e] is odd and nums[o] is even -> swap
            int temp = nums[e];
            nums[e] = nums[o];
            nums[o] = temp;
            e += 2;
            o += 2;
        }
    }

    
    return nums;
}


public int[] sortArrayByParityIIBestOpt(int[] nums) {
    int ans [] = new int[nums.length];
int evenIndex = 0;
int oddIndex = 1;
for(int i : nums){
  if(i % 2 == 0 ){
      ans[evenIndex] = i;
      evenIndex += 2;
  }
  if(i % 2 == 1){
      ans[oddIndex] = i;
      oddIndex += 2;
  }
 
}  
return ans;      

}

}
