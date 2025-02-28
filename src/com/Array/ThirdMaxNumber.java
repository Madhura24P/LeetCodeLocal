package com.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int nums[]= {3,2,1};
		//int nums[]= {1,2147483647,-2147483648};


	thirdMax(nums);
		

	}
	
public static int thirdMax(int[] nums) {
	int max=Integer.MIN_VALUE;
	Set<Integer> s=new HashSet<>();
	//Arrays.sort(nums);
	
	
	for(int n:nums)
	{
		s.add(n);
	}
	
	int [] numS=s.stream().mapToInt(Integer::intValue).toArray();
	int start=0;
	int bstart=numS.length-1;
	
	while(start<numS.length)
	{
		if(numS[start]>numS[bstart])
		{
			int temp=numS[bstart];
			numS[bstart]=numS[start];
			numS[start]=temp;
			start++;
		}else
		{
			start++;
		}
	}
	
	
	System.out.println(Arrays.toString(numS));
	Arrays.sort(numS);
	 int tempmax=numS[numS.length-1];
	 int count=0;
	 int i=numS.length-1;
	
	while(count<3 && i>=0)
	{
		if(numS[i]<=tempmax)
		{
			tempmax=numS[i];
			count++;
			
		}
		i--;
	}
	System.out.println("count"+count);
	
	if(count!=3)
	{
		max=numS[numS.length-1];
		
	}else
	{
		max=tempmax;
	}
	
	
	System.out.println(max);
	return max;
        
    }

public static int thirdMaxOpt(int[] nums) {
    Integer max1 = null;
    Integer max2 = null;
    Integer max3 = null;
    for (Integer n : nums) {
        if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
        if (max1 == null || n > max1) {
            max3 = max2;
            max2 = max1;
            max1 = n;
        } else if (max2 == null || n > max2) {
            max3 = max2;
            max2 = n;
        } else if (max3 == null || n > max3) {
            max3 = n;
        }
    }
    return max3 == null ? max1 : max3;
}

public void maxThird(int nums[])
{
	
	Set<Integer> setNums=Arrays.stream(nums).boxed().collect(Collectors.toSet());
	
	Optional<Integer> third=setNums.stream().
			sorted(Comparator.reverseOrder()).skip(2).findFirst();
	
	if(third.isPresent())
	{
		third.get();
	}else
	{
		Arrays.stream(nums).boxed().
		sorted(Comparator.reverseOrder()).findFirst();
	}
	
	
}

}
