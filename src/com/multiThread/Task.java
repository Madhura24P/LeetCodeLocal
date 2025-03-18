package com.multiThread;

import java.util.concurrent.Semaphore;

public class Task implements Runnable{
	
	private final Semaphore s;
	public Task(Semaphore s)
	{
		this.s=s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		s.acquire();
		System.out.println("Thread:"+Thread.currentThread().getName());
		Thread.sleep(2000);
		s.release();
		
		}catch(Exception ex)
		{
			
		}
		
		
	}
	
}
