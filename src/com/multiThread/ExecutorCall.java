package com.multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCall {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		System.out.println("Main head");
		
		Callable<String> c=()->{ return "hi"+Thread.currentThread().getName();};
		
		ExecutorService ex=Executors.newCachedThreadPool();
		
		Future<String> fs=ex.submit(c);
		System.out.println(fs.get());
		//ex.submit(c);
		System.out.println("Main tail");
		
		
		
		
		
		
	}

}
