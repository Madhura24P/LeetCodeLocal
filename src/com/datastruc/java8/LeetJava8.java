package com.datastruc.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LeetJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub8
		
		//Highest Length word in sentence:
		String s="I am learning streams api in Java";
		String sMaxLength=Stream.of(s.split(" ")).
				sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
		System.out.println(sMaxLength);
		//OR
		String sMaxWord=Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(sMaxWord);
	}

}
