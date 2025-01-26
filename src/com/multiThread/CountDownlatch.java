package com.multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownlatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main head");
		CountDownLatch c=new CountDownLatch(3);
		Runnable r=() -> {
			System.out.println("hi"+Thread.currentThread().getName());
			c.countDown();
		};
		
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(r);
		es.execute(r);
		es.execute(r);
		
		
		  try { 
			  c.await(); 
			  //System.out.println("Main end");
		  }catch(InterruptedException e) {
		  
		  }
		 
		
		System.out.println("Main End");
		
		es.shutdown();
		
		
		
		
		
		

	}

}
