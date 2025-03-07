package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigitEqal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hasSameDigits("3902");

	}
	
	public static void hasSameDigits(String s)
	{
		boolean flag=false;
		boolean track=true;
		Map<Integer,String> mapS=new HashMap<>();
		int indx=1;
		mapS.put(1, s);
		
		while(track)
		{
		final String s1=mapS.get(indx);
		if(s1.length()>2) {
		StringBuilder sb=new StringBuilder();
		
		IntStream.rangeClosed(0, s1.length()-2).forEach(x ->{
			int x1=Integer.valueOf(s1.substring(x, x+1));
			int x2=Integer.valueOf(s1.substring(x+1, x+2));
			int x3=x1+x2;
			sb.append(x3%10);
			
		});
		System.out.println(sb);
		indx=indx+1;
		mapS.put(indx, sb.toString());
		}else
		{
			if(s1.charAt(0)==s1.charAt(1))
			{
				flag=true;
			
			}
			track=false;
			break;
			
		}
		
		
		}
		System.out.println(flag);
		
	}

}
