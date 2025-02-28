package com.KthSeries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeastUniqKRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1,8,3,5,1,3};
		int k=3;
		findLeastNumOfUniqueInts(arr, k);

	}
	
public static int findLeastNumOfUniqueInts(int[] arr, int k) {
	List<Integer> listArr=Arrays.stream(arr).boxed().collect(Collectors.toList());
	
	Map<Integer,Long> mapFreq=listArr.stream().collect(
			Collectors.groupingBy(
					Function.identity(),Collectors.counting()
					)).entrySet().stream().
			sorted(
					Map.Entry.<Integer,Long>comparingByValue()
					).
			collect(
					Collectors.toMap(
							Map.Entry::getKey, 
							Map.Entry::getValue,
							(e1,e2)->e1,
							LinkedHashMap::new
							)
					);
	
	System.out.println(mapFreq);
	List<Integer> removedList=new ArrayList<>();
	
	for(Map.Entry<Integer, Long> e:mapFreq.entrySet())
	{
		if(k>0)
		{
		if(e.getValue()<=k)
		{
			k=(int) (k-e.getValue());
			removedList.add(e.getKey());
			
		}else
		{
			k=(int)(e.getValue()-k);
		}
		}
		else
		{
			break;
		}
	}
	
	int count=mapFreq.size()-removedList.size();
	System.out.println(count);
	return count;
        
    }

}


//use priorit Q based on freq value for better performance .