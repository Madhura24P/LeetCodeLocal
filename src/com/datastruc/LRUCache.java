package com.datastruc;

import java.util.*;
import java.util.LinkedList;

public class LRUCache {
	
	class Cache
	{
		int key;
		String value;
		Cache(int key,String value)
		{
			this.key=key;
			this.value=value;
		}
	}
	
	static Deque<Integer> q=new LinkedList<>();
	
	static Map<Integer,Cache> map=new HashMap<>();
	int CACHE_CAPACITY=4;
	
	public String getElementCache(int key)
	{
		if(map.containsKey(key))
		{
			Cache curr=map.get(key);
			q.remove(curr.key);
			q.addFirst(curr.key);
			return curr.value;
		}
		return "NA";
	}
	
	
	public void putElement(int key,String value)
	{
		if(map.containsKey(key))
		{
			Cache curr=map.get(key);
			q.remove(curr.key);
		}
		else
		{
			if(q.size()==CACHE_CAPACITY)
			{
				int temp=q.removeLast();
				map.remove(temp);
			}
		}
		Cache c=new Cache(key,value);
		q.addFirst(c.key);
		map.put(c.key, c);
		
	}
	
	
public static void main(String[] args) {
	LRUCache L=new LRUCache();
	L.putElement(1, "v_1");
	L.putElement(2, "v_2");
	L.putElement(3, "v_3");
	L.putElement(4, "v_4");
	
	System.out.println(q);
	System.out.println(L.getElementCache(2));
	System.out.println(q);
	
	System.out.println(L.getElementCache(5));
	System.out.println(q);
	
	L.putElement(5, "v_5");
	System.out.println(q);
	
	
	
	
	
	
}
}
