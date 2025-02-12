package com.datastruc;

import java.util.*;

public class LoadBalancer {
	
	private List<Server> servers;
	
	public LoadBalancer()
	{
		servers=new ArrayList<>();
	}
	
	public void addServer(String ip,int currLoad)
	{
		servers.add(new Server(ip,currLoad));
	}
	
	public String getNextServer()
	{
		if(servers.isEmpty())
		{
			throw new IllegalStateException();
			
		}
		
		Server minLoad=servers.get(0);
		
		for(Server s: servers)
		{
			if(minLoad.getCurrLoad()>s.getCurrLoad())
			{
				minLoad=s;
			}
		}
		
		minLoad.incrementLoad();
		
		return minLoad.getIpAddress();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LoadBalancer lb=new LoadBalancer();
		
		lb.addServer("192.10.01.20", 10);
		lb.addServer("111.10.10.01", 6);
		lb.addServer("222.10.10.02", 4);
		
		String ip1=lb.getNextServer();
		System.out.println(ip1);
		String ip2=lb.getNextServer();
		System.out.println(ip2);
		String ip3=lb.getNextServer();
		System.out.println(ip3);
		String ip4=lb.getNextServer();
		System.out.println(ip4);

	}



@Override
	public String toString() {
		return "LoadBalancer [servers=" + servers + "]";
	}



public class Server {
	
	private String ipAddress;
	private int currLoad;
	
	public Server(String ip,int load)
	{
		this.ipAddress=ip;
		this.currLoad=load;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getCurrLoad() {
		return currLoad;
	}

	public void setCurrLoad(int currLoad) {
		this.currLoad = currLoad;
	}
	
	public void incrementLoad()
	{
		currLoad++;
	}
	
	
	@Override
	public int hashCode()
	{
		return Objects.hash(ipAddress);
	}
	
	
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Server s=(Server)obj;
		return Objects.equals(this.getIpAddress(), s.getIpAddress());
	}
	

}
}