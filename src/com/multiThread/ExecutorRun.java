package com.multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRun {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		System.out.println("main top");
		Runnable r=()->{
			for(int i=0;i<5;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				
			}
				};
				
				Runnable r2=()->{
					for(int i=0;i<5;i++)
					{
						if(i%2!=0)
						{
							System.out.println(i);
						}
						
					}
						};
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(r2);
		
		//es.execute(r);
		//es.execute(r);
		
		es.shutdown();
		
		System.out.println("main bottom");

	}

}
