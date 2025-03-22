package com.datastruc;

import java.util.LinkedList;

public class Graph {
	
	private LinkedList<Integer>[] adj;
	private int V;//number of vertices
	private int E;//number of edges
	
	public Graph(int nodes)
	{
		this.V=nodes;
		this.E=0;
		this.adj=new LinkedList[nodes];
		for(int v=0;v<V;v++)
		{
			adj[v]=new LinkedList<>();
		}
	}
	
	public void addEdge(int u,int v)
	{
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
