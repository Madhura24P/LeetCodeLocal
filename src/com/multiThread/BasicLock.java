package com.multiThread;

import java.util.concurrent.locks.*;

public class BasicLock {
	
	private Lock res=new ReentrantLock();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void criticalMethod()
	{
		res.lock();
		try {
		System.out.println("critical section");
		}finally {
		res.unlock();
		}
	}

}
