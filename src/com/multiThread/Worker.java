package com.multiThread;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{
	
	CountDownLatch ch;
	
	public Worker(CountDownLatch ch)
	{
		this.ch=ch;
	}

	@Override
	public void run() {
		System.out.println("hi"+Thread.currentThread().getName());
		ch.countDown();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
