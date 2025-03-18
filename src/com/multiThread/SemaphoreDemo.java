package com.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semaphore s=new Semaphore(2);
		ExecutorService es=Executors.newFixedThreadPool(10);
		es.execute(new Task(s));
		es.execute(new Task(s));
		es.execute(new Task(s));
		es.execute(new Task(s));
		es.execute(new Task(s));
		es.execute(new Task(s));
		es.shutdown();

	
	
	

}

}