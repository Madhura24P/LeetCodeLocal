package com.datastruc.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        Map<String,Long> mapChar=Stream.of(s3.split("")).
        		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapChar);
        
        //Re-arrange for highest or low
        //--to do
        
        //first non repeatable char
        String s4="Hello World";
        Map<String,Long> charMapFirst=Stream.of(s4.split("")).collect(
        		Collectors.groupingBy(
        				Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println("Way 1:"+charMapFirst.entrySet().stream().findFirst().get().getKey());
        		
        System.out.println("Way 2:"+s4.chars().mapToObj(x->(char)x).
        filter(x->s4.indexOf(x)==s4.lastIndexOf(x)).
        findFirst().get());
        
        //group by range
          int arr1[]= {2,3,10,14,24,29,30,35};
          List<Integer> list_arr1=Arrays.stream(arr1).boxed().collect(Collectors.toList());
          Map<Integer,List<Integer>> map_arr1=list_arr1.stream().collect(
        		  Collectors.groupingBy(x->x/10*10,Collectors.toList())
        		  );
          System.out.println(map_arr1);
          
          //nonNumeric char
          List<String> listStr=Arrays.asList("a1b2c3","4g5h6","123xyc");
          List<String>listup=listStr.stream().map(x->x.replaceAll("[A-Za-z]","")).
        		  collect(Collectors.toList());
          System.out.println(listup);
          
          //firstocc:
          String t="hi";
          OptionalInt indexOpt = IntStream.range(0, s.length() - t.length() + 1)
		            .filter(i -> s.substring(i, i + t.length()).equals(t))
		            .findFirst();
		if (indexOpt.isPresent()) {
		System.out.println("First occurrence of substring is at index: " + indexOpt.getAsInt());
		} else {
		System.out.println("Substring not found.");
		}
		
		List<String> fruits=List.of("orange","kiwi","apple","kiwi");
		fruits.stream().distinct().collect(
				Collectors.toMap(f->f, String::length)
				).entrySet().stream().forEach(e->
				{
					System.out.println("key"+e.getKey()+" "+"Value"+e.getValue());
				});
		
		

        
	}

}
