package com.TwoPointer.Easy;

import java.util.HashMap;
import java.util.Map;

public class KDiffPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
		public int findPairs(int[] nums, int k) {
 			Map<Integer, Integer> map = new HashMap();
 			for (int num : nums)
 				map.put(num, map.getOrDefault(num, 0) + 1);

 			int result = 0;
 			for (int i : map.keySet())
 				if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
 					result++;
 			return result;
 		}


}
