package com.String;

public class FindWordsFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int countCharacters(String[] words, String chars) {
		  int []charArr=new int[26];
		  int res=0;
		  for(char c:chars.toCharArray())
		  {
			charArr[c-'a']++;  
		  }
		  
		  for(String s:words)
		  {
			  int []sArr=new int[26];
			  for(char s1:s.toCharArray())
			  {
				  sArr[s1-'a']++;
			  }
			  
			  boolean flag=true;
			  for(int i=0;i<26;i++)
			  {
				  if(charArr[i]>=sArr[i])
				  {
					  continue;
				  }else
				  {
					flag=false;
					break;
				  }
			  }
			  
			  if(flag)
			  {
				  res+=s.length();
			  }
			  
		  }
		  
		  return res;
	        
	    }

}
