package com.String;

public class BackspaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab#c";
		String t="ad#c";
		meth(s,t);

	}
	
	public static boolean meth(String s,String t)
	{
		boolean flag=false;
		StringBuilder s_upd=new StringBuilder();
		StringBuilder t_upd=new StringBuilder();
		
		char s_c[]=s.toCharArray();
		int s_count=0;
		int s_len=s.length()-1;
		for(int i=s_len;i>=0;i--)
		{
			if(s_c[i]=='#')
			{
				s_count++;
			}else if(s_count>0)
			{
				s_count--;
				continue;
			}else
			{
				s_upd=s_upd.append(s_c[i]);
			}
		}
		
		System.out.println(s_upd.reverse());
		
		char t_c[]=t.toCharArray();
		int t_count=0;
		for(int i=(t_c.length-1);i>=0;i--)
		{
			if(t_c[i]=='#')
			{
				t_count++;
			}else if(t_count>0)
			{
				t_count--;
				continue;
			}else
			{
				t_upd=t_upd.append(t_c[i]);
			}
		}
		
		System.out.println(t_upd.reverse());
		flag=s_upd.toString().equals(t_upd.toString());
		System.out.println(flag);
		
		return flag;
	}

}
