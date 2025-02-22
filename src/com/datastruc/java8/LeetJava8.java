package com.datastruc.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
        //Socnd highest
       String secondMax=Stream.of(s.split(" ")).
    		   sorted(
    				   Comparator.comparing(String::length).reversed())
    		   .skip(1).
    		   findFirst().
    		   get();
       System.out.println(secondMax);
        
        //Remove dup
        String s1="dabcadefg";
        String uniqStr=Stream.of(s1.split("")).distinct().collect(Collectors.joining());
        System.out.println(uniqStr);
        
        //Freq of words
        String s2="Learning streams for Java API in Java";
        Map<String,Long> strMap=Stream.of(s2.split(" ")).
        		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(strMap);
        
        //Words with 2 vowels
        List<String> wordList=Stream.of(s2.split(" ")).collect(Collectors.toList());
        String vowel="AEIOUaeiou";
        System.out.println( wordList.stream().filter(
        		(Predicate<String>) x->x.replaceAll("[^AEIOUaeiou]", "").length()==2)
             .collect(Collectors.toList()));
        //Divide array into list of even and odd
        int []arr= {1,2,3,4,5,6};
        List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        List<List<Integer>> res=map.entrySet().stream().map(m->m.getValue()).collect(Collectors.toList());
        System.out.println(res);
        
        //Find occur of each char
        String s3="Mississippi";
        Map<String,Long> mapChar=Stream.of(s3.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapChar);
        
        //Re-arrange for highest or low
        
        
	}

}
