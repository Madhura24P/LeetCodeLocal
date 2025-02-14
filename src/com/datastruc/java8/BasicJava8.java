package com.datastruc.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=Arrays.asList(15,20,35,4,8,8);
		
		//print even nums
		List<Integer> evenList=l.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("even List:"+evenList);
		
		//Sum
		int sum=l.stream().reduce((a,b)->a+b).get();
		System.out.println("sum:"+sum);
		
		int sum1=l.stream().mapToInt(e->e).sum();
		System.out.println("sum1:"+sum1);
		
		//avg
		double  avg=l.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("avg:"+avg);
		
		//min
		int min=l.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min:"+min);
		
		//max
		int max=l.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("max"+max);
		
		//duplicate
		List<Integer> dup=l.stream().filter(e->Collections.frequency(l, e)>1).distinct().collect(Collectors.toList());
		System.out.println("dup"+dup);
		
		Set<Integer> s=new HashSet<>();
		Set<Integer> sDup=l.stream().filter(e->!s.add(e)).collect(Collectors.toSet());
		System.out.println("sDup:"+sDup);
		
		//second max
		int secondMax=l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("seocnd Max"+secondMax);
		
		//sort in ASC
		List<Integer> ascList=l.stream().sorted().toList();
		System.out.println("ascList"+ascList);
		
		//sort rev
		List<Integer> descList=l.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(descList);
		
		
		
		
		
		
		

	}

}
