package com.datastruc.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
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
        
        //Find occur of each char62
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
		
		List<String> fruits=List.of("orange","kiwi","apple","kiwi","pear");
		fruits.stream().distinct().collect(
				Collectors.toMap(f->f, String::length)
				).entrySet().stream().forEach(e->
				{
					System.out.println("key"+e.getKey()+" "+"Value"+e.getValue());
				});
		
		List<String> fruitsList=List.of("orange","kiwi","apple","kiwi","pear");
		fruits.stream().distinct().collect(
				Collectors.groupingBy(String::length,Collectors.toList())
				).entrySet().stream().forEach(e->
				{
					System.out.println("key"+e.getKey()+" "+"Value"+e.getValue());
				});
		
		List<String> words=Arrays.asList("madam","java");
		words.stream().filter(w-> w.equals(
				new StringBuilder(w).reverse().toString())).
		collect(Collectors.toList());
		
		String truncS="how are you";
		
		String trunc=Stream.of(truncS.split(" ")).limit(2).collect(Collectors.joining(" "));
		System.out.println(trunc);
		
		//kth distinct string
		String arrS[]= {"d","b","b","a"};
		int k=2;
		Arrays.stream(arrS).collect(
				Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new,Collectors.counting()))
		        .entrySet().stream().filter(x->x.getValue()==1).
		        map(x->x.getKey()).toList().stream().skip(k-1).
		        findFirst().orElse("");
		
		//smallestIndex
		int arrInd[]= {0,1,2};
		int resInd=IntStream.range(0, arrInd.length).
		filter(x-> x%10==arrInd[x]).findFirst().orElse(-1);
		
		//Common Words once
		String words1[]= {"leetcode","hi"};
		String words2[]= {"hi","hi","leetcode"};
		
		Map<String,Long> m1=Arrays.stream(words1).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Map<String,Long> m2=Arrays.stream(words2).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		List<String> listW=m1.entrySet().stream().
				filter(x->
		m2.containsKey(x.getKey()) && m2.get(x.getKey())==x.getValue()
		).map(x->x.getKey()).toList();
		
		listW.size();
		
		//count negative numbers
		int [][] arrN= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		int [] arrN_flat=Arrays.stream(arrN).flatMapToInt(Arrays::stream).sorted().toArray();
		long countN=Arrays.stream(arrN_flat).boxed().filter(x->x<0).count();
		//Integer.valueOf(countN);
		System.out.println(countN);
		
		//Capitalize Tile
		String cap="For oF EaCH word";
		String resultCap=Stream.of(cap.split(" ")).
		map(sL-> sL.toLowerCase()).
		map(sC-> {
			if(sC.length()>2) {
			 sC=Character.toUpperCase(sC.charAt(0))+sC.substring(1);
			}
			return sC;
			}
		)
		.collect(Collectors.joining(" "));
		System.out.println(resultCap);
		
		//First letter to appear twice
		String rep="addchh";
		String char_rep=Stream.of(rep.split("")).collect(Collectors.groupingBy
				(Function.identity(),LinkedHashMap::new,
				Collectors.counting()))
		.entrySet().stream().
		filter(e->e.getValue()>=2).
		findFirst().get().getKey();
		System.out.println(char_rep);
		
		Set<Character> sRep=new HashSet<>();
        Optional<String> cRep=Stream.of(rep.split("")).filter(x->!sRep.add(x.charAt(0))).findFirst();
		
		System.out.println(cRep.get());
		
		Map<String,Integer> mapHeight=new HashMap<>();
		
		mapHeight.put("Marie", 180);
		mapHeight.put("Emma", 165);
		
		List<String> sortHt=mapHeight.entrySet().stream().
				sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).
		map(x->x.getKey()).collect(Collectors.toList());
		sortHt.toArray(new String[0]);
		

		}    
	}

