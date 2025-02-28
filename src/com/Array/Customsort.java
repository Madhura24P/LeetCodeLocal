package com.Array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Customsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customSortString("cba", "abcd");
		

	}
	
	 public static void customSortString(String order, String s) {
		 
		 StringBuilder sb=new StringBuilder();
		// String scpy=new String(s);
		 
		Map<String,Long> mapOrder=Stream.of(order.split("")).
				collect(Collectors.groupingBy(Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()));
		
		Map<String,Long> mapS=Stream.of(s.split("")).
				collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		System.out.println(mapS);
		System.out.println(mapOrder);
		
		mapOrder.entrySet().stream().forEach(x->{
		
			if(s.contains(x.getKey()))
			{
				long val=mapS.get(x.getKey());
				while(val>0)
				{
				sb.append(x.getKey());
				val--;
				mapS.put(x.getKey(), mapS.get(x.getKey())-1);
				}
			}
			
			
			
		});
		
		mapS.entrySet().stream().forEach(x->{
			
			long val=x.getValue();
			while(val>0)
			{
				sb.append(x.getKey());
				val--;
			}
			
		});
		
	        System.out.println(sb.toString());
	    }

}
