package com.String;

import java.util.*;

public class CommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]={"cool","lock","cook"};
		commonChars(s1);
	}
	
	 public static List<String> commonChars(String[] words) {
		 
		 List<String> commList=new ArrayList<>();
		 int []min_freq=new int[26];
		 Arrays.fill(min_freq, Integer.MAX_VALUE);
		 //int i=0;
		 for(String n:words)
		 {
			 char[] c=n.toCharArray();
			 int [] curr_freq=new int[26];
			for(char c1:c)
			{
               curr_freq[c1-'a']++;
			}
			for(int i=0;i<26;i++)
			{
				min_freq[i]=Math.min(min_freq[i], curr_freq[i]);
			}
			 
			 
		 }
		 
		 
		 
		 
		 System.out.println(Arrays.toString(min_freq));
		 for(int i=0;i<26;i++)
		 {
			 while(min_freq[i]!=0)
			 {
				 commList.add(Character.toString((char)('a'+i)));
				 min_freq[i]--;
			 }
		 }
		 
		 System.out.println(commList);
		 return commList;
	        
	    }

}
