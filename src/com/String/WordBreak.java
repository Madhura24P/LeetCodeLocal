package com.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s="aaaaaaa";
		List<String> l=Arrays.asList("aaaa","aaa");
		wordBreakOpt(s, l);

	}
	
public static boolean wordBreak(String s, List<String> wordDict) {
	boolean flag=false;
	
	wordDict=wordDict.stream().sorted((o1, o2) -> o1.length()-o2.length()).collect(Collectors.toList());
	System.out.println(wordDict);
	
	for(String sw:wordDict)
	{
		if(!s.isBlank()||!s.isEmpty())
		{
			if(s.contains(sw))
			{
				s=s.replaceAll(sw, "");
				System.out.println(s);
			}
		}else
		{
			flag=true;
			break;
		}
	}
	
	if(s.isBlank()||s.isEmpty())
	{
		flag=true;
	}
	
	System.out.println(flag);
	return flag;
        
    }




public static boolean wordBreakOpt(String s, List<String> wordDict) {

	Set<String> set=new HashSet<>(wordDict);
	return helper(0,0,s,set);
	
}

public static boolean  helper(int start,int end,String s,Set<String> set)
{
	if(end==s.length()-1)
	{
		if(set.contains(s.subSequence(start, end+1)))
			return true;
		return false;
	}
	
	if(set.contains(s.subSequence(start, end+1)))
	{
		if(helper(end+1,end+1,s,set))
		{
			return true;
		}
	}
	
	return helper(start,end+1,s,set);
}
}