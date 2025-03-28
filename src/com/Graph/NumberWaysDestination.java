package com.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class NumberWaysDestination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]roads= {{0,6,7},{0,1,2},{1,2,3},{1,3,3},
		               {6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};
		countPaths(7, roads);
		

	}
	
	private Map<Integer,Map<Integer,Integer>> graph;
	
	public NumberWaysDestination(int n)
	{
		graph=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			graph.put(i,new HashMap<>());
		}
	}
	
	public void addNode(int u,int v,int t)
	{
		Map<Integer,Integer> dTime=graph.get(u);
		dTime.put(v, t);
	}
	
public static int countPaths(int n, int[][] roads) {
	
	Map<Integer,Map<Integer,Integer>> graph = new HashMap<>();
	for(int i=0;i<n;i++)
	{
		graph.put(i,new HashMap<>());
	}
	int roadlen=roads.length;
	
	for(int j=0;j<roadlen;j++)
	{
		Map<Integer,Integer> dTime=graph.get(roads[j][0]);
		dTime.put(roads[j][1], roads[j][2]);
	}
	

	graph.entrySet().stream().
    forEach( x ->
    {
      System.out.println("Key:"+x.getKey());
      x.getValue().entrySet().stream().
      forEach(v -> 
      { 
    	  System.out.println("Key_1:"+v.getKey());
    	  System.out.println("Value_1:"+v.getValue());
      
      });
    }
    );
	
	
	//int smallestTime=graph.get(0).get(n-1);
	List<Integer> smallTime=new ArrayList<>();
	int count=0;
	
	Queue<Integer> q=new LinkedList<>();
	q.add(0);
	
	
	   Set<Integer> nSet=new HashSet<>();
	   nSet.add(0);
	   //0,6 , 1 
	   int currTime=0;
	   
	   while(!q.isEmpty())
	   {
		Map<Integer,Integer> currMap=graph.get(q.poll());//0,1,2
		for(Map.Entry<Integer, Integer> e:currMap.entrySet())//6,1,4 //3,2
		{
			q.add(e.getKey());
			nSet.add(e.getKey());
			currTime=currTime+e.getValue();
			
			if(e.getKey()==n-1)
			{
				smallTime.add(currTime);
				q.poll();
				currTime=0;
			}
			
			else if (graph.get(e.getKey()).containsKey(n-1))
			{
				currTime=currTime+graph.get(e.getKey()).get(n-1);
				q.poll();
				smallTime.add(currTime);
				currTime=0;
				
			}
			
			
			
	}
		
	}
	
	
	System.out.println(smallTime);
	return count;
        
    }

//public void 

	
	

}
