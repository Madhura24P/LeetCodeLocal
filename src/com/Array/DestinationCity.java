package com.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DestinationCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}
	
	 public String destCity(List<List<String>> paths) {
		 
		 Map<String,Integer> cityMap=new HashMap<>();
		 String dCity="";
		 
		 for(List<String> curr:paths)
		 {
				 cityMap.put(curr.get(0),cityMap.getOrDefault(curr.get(0),0)+1);
				 
		 }
		 
		 for(List<String> curr:paths)
		 {
			 if(!cityMap.containsKey(curr.get(1)))
			 {
				 dCity=curr.get(1);
			 }
		 }
		 
	        return dCity;
	    }
	 
	 public String destCityOpt(List<List<String>> paths) {
	 {
	        Set<String> cities = new HashSet<>(); 
	        for (List<String> path : paths) {
	            cities.add(path.get(0)); 
	        }
	        
	        for (List<String> path : paths) {
	            String dest = path.get(1); 
	            if (!cities.contains(dest)) {
	                return dest; 
	            }
	        }
	        return "";

	 }

}
}