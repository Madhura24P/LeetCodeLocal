package com.multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDownLatch ch=new CountDownLatch(3);
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		Worker w1=new Worker(ch);
		System.out.println("Main Start");
		ex.execute(w1);
		ex.execute(w1);
		ex.execute(w1);
		
		try {
			ch.await();
		}catch(InterruptedException em)
		{
			em.printStackTrace();
		}
		
		System.out.println("Main End");
ex.shutdown();
	}

}
