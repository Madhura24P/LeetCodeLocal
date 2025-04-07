package com.String;

import java.security.cert.X509Certificate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public List<List<String>> groupAnagrams(String[] strs) {
		  
		  List<String> l=Arrays.stream(strs).toList();
		  
		  //l.stream().collect(Collectors.groupingBy(x->
		  ///Arrays.stream(x.toLowerCase().split("")).
		  //sorted().collect(Collectors.toList())));
		  

	        List<List<String>> res=new ArrayList<>();
			 
			 if(strs.length==0)
			 {
				 return res;
			 }
			 
			 Map<String,List<String>> subRes=new HashMap<>();
			 for(String s:strs)
			 {
				 char []c=s.toCharArray();
				 Arrays.sort(c);
				 String key=String.valueOf(c);
				 //System.out.println(key);
				 List<String> val=subRes.getOrDefault(key, new ArrayList<>());
				 val.add(s);
				 subRes.put(key, val);
				 
			 }

		        Set<Map.Entry<String, List<String>>> e=subRes.entrySet();
		        for(Map.Entry<String, List<String>> e1:e)
		        {
		        	List<String> val=e1.getValue();
		        	//System.out.println(e1.getKey()+" "+val);
		        	res.add(val);
		        }
			 
			 return res;

	  }
	  
	  public static void groupAnagrams_Java8(String str[])
	  {
		  Map<Object,List<String>> strMap=Arrays.stream(str).collect(
				  Collectors.groupingBy( x->
				  Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList())));
		  
		  List<List<String>> finalVal=(List<List<String>>) strMap.values();
		  System.out.println(finalVal);
		  
		  
	  }

}
