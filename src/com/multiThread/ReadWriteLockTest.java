package com.multiThread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
	
	private static final ReadWriteLock rw=new ReentrantReadWriteLock();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Read()
	{
		rw.readLock().lock();
		try {
			System.out.println("Critical Read");
		}finally
		{
			rw.readLock().unlock();
		}
	}
	
	public void Write()
	{
		rw.writeLock().lock();
		try
		{
			System.out.println("Wite critical");
			
		}finally
		{
			rw.writeLock().unlock();
		}
	}

}
