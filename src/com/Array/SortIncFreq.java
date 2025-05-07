package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortIncFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int[] frequencySort(int[] nums) {
	
	List<Integer> res=new ArrayList<>();
	Arrays.stream(nums).boxed().
	collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue().
			thenComparing(
			Map.Entry.comparingByKey(Comparator.reverseOrder())))
	.forEach(x -> {
		int val=x.getValue().intValue();
		
		while(val>0)
		{
			res.add(x.getKey());
			val--;
		}
		
	});
        
	return res.stream().mapToInt(x->x).toArray();
    }

public int sumOfUnique(int[] nums) {
	
	return Arrays.stream(nums).boxed().
	collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey())
	.mapToInt(x->x).sum();
    
}

}
