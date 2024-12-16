package com.String;

import java.util.*;

public class GroupAnangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []strs = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(strs);

	}
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
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
	        	System.out.println(e1.getKey()+" "+val);
	        	res.add(val);
	        }
		 
		 return res;
		 
	        
	    }

}
