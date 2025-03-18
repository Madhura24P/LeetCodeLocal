package com.multiThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Friend extends Thread{
	
	private final CyclicBarrier cb;
	private final String name;
	
	public Friend(CyclicBarrier cb,String name)
	{
		this.name=name;
		this.cb=cb;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(name+"Gettimg Ready");
			gettingReady();
			System.out.println(name+"is Ready and wiating for"+
		(cb.getParties()-cb.getNumberWaiting()-1)+"at meeting pt");
			cb.await();
			System.out.println(name+"continue trip");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void gettingReady()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
