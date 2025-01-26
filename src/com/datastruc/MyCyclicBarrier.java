package com.datastruc;

public class MyCyclicBarrier {
	
	int iniPermits;
	int partyAwait;
	
	Runnable CyclicBarrierEvent;
	
	public MyCyclicBarrier(int parties,Runnable event)
	{
		this.iniPermits=parties;
		partyAwait=parties;
		this.CyclicBarrierEvent=event;
	}
	
	public synchronized void await() throws InterruptedException
	{
		partyAwait--;
		
		if(partyAwait>0)
		{
			this.wait();
		}
		else
		{
			partyAwait=iniPermits;
			notifyAll();
			CyclicBarrierEvent.run();
		}
			
	
	}
	
	

}
