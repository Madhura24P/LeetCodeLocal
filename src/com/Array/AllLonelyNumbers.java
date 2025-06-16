package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllLonelyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10,6,5,8};
		findLonely(nums);
		

	}
	
public static List<Integer> findLonely(int[] nums) {
	
	List<Integer> numList=Arrays.stream(nums).boxed().toList();
	List<Integer> res=numList.stream().filter(x->Collections.frequency(numList,x)==1).
	filter(x->!numList.contains(x-1)).filter(x->!numList.contains(x+1)).toList();
	System.out.println(res);
	return res;
        
    }



public static List<Integer> findLonelyOpt(int[] nums) {
	Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    List<Integer> res = new ArrayList<>();
	for (int num : map.keySet()) {
   //  for (int num : nums) {
        if (map.get(num) == 1 && !map.containsKey(num - 1)
        		&& !map.containsKey(num + 1)) {
            res.add(num);
        }
    }
    return res;

	

}

}
