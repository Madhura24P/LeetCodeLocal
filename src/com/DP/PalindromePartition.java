package com.DP;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aab";
		partition(s);

	}
	
	  public static List<List<String>> partition(String s) {
		  List<List<String>> res=new ArrayList<>(); 
		  helper(s,new ArrayList<>(),res);
		  System.out.println(res);
		  return res;
				
	    }
	  
	 public static void helper(String s,List<String> curr,List<List<String>> res)
	  {
		  if(s.length()==0)
		  {
			  res.add(new ArrayList<>(curr));
			  return;
		  }
		  for(int i=0;i<s.length();i++)
			{
				String temp=s.substring(0, i+1);
				if(checkString(temp))
				{
					curr.add(temp);
					helper(s.substring(i+1),curr,res);
					curr.remove(curr.size()-1);
				}
				
				
			}


		  
	  }
	  
	 
	  public static boolean checkString(String s)
	  {
		  int left=0;
		  int right=s.length()-1;
		  while(left<right)
		  {
			  if(s.charAt(left)!=s.charAt(right)) return false;
			  left++;
			  right--;
		  }
		  return true;
		  
		  
	  }
	  
	  

}
