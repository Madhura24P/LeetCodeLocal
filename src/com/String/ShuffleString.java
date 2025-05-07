   package com.String;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public String restoreString(String s, int[] indices) {
	
	if(s==null || s.length()==0 || s.length()!=indices.length )
	{
		return "";
		}
	
	char []sChar=new char[indices.length];
	
	IntStream.range(0, indices.length).forEach(x -> {
		int pos=indices[x];
		sChar[pos]=s.charAt(x);
		
	});
	
	StringBuilder sb=new StringBuilder();
	for(char c:sChar)
	{
		sb.append(c);
	}
        return sb.toString();
    }

}
