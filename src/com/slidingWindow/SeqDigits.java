package com.slidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SeqDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=10;
		System.out.println(i.toString().length());

	}
	
public List<Integer> sequentialDigits(int low, int high) {
    List<Integer> listNum=new ArrayList<>();
	for(int i=low;i<=high;i++)
	{
		String num=Integer.valueOf(i).toString();
		int n=0;
		while(n<num.length()-1)
		{
			if(num.charAt(n)-'0'+1==num.charAt(n+1)-'0')
			{
				n++;
				continue;
			}else
			{
				break;
			}
		
		}
		if(n+1==num.length())
		{
			listNum.add(Integer.parseInt(num));
		}
		
		
	}
	
	return listNum;
    }

public List<Integer> sequentialDigitsOpt(int low, int high) {
	List<Integer> listNum=new ArrayList<>();
	String digits="123456789";
	List<Integer> res=new ArrayList<>();
	int lowLength=String.valueOf(low).length();
	int highlength=String.valueOf(high).length();
	
	for(int i=lowLength;i<=highlength;i++)
		for(int j=0;j<=digits.length()-i;j++)
		{
			String seqStr=digits.substring(j, j+i);
			int num=Integer.parseInt(seqStr);
			if(num>=low && num<=high)
			{
				listNum.add(num);
			}
			
		}
	

	
	
	return listNum;
}

}
