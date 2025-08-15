package com.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxOddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1010";
		maximumOddBinaryNumber(s);

	}
	
    public static String maximumOddBinaryNumber(String s) {
    	 int cnt1 = 0, cnt0 = 0;
         for (char a : s.toCharArray()) {
             if (a == '1') cnt1++;
             else if (a == '0') cnt0++;
         }
         StringBuilder ans = new StringBuilder();
         ans.append("1".repeat(cnt1 - 1));
         ans.append("0".repeat(cnt0));
         ans.append("1");
         return ans.toString();
    }


}
