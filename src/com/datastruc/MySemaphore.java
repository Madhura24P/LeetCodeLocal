package com.datastruc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MySemaphore {
	
	private final ReentrantLock lock=new ReentrantLock();
	private final Condition permitsAvaialable=lock.newCondition();
	
	private int permits;
	
    public MySemaphore(int initialPermits) {
        this.permits = initialPermits;
    }
    
    public void acquire() throws InterruptedException
    {
    	lock.lock();
    	try {
    		while(permits==0)
    		{
    			permitsAvaialable.await();
    		}
    		permits--;
    	}finally {
    		lock.unlock();
    	}
    }
    
    public void release()
    {
    	lock.lock();
    	try
    	{
    		permits++;
    		permitsAvaialable.signal();
    		
    	}finally
    	{
    		lock.unlock();
    	}
    	
    }


}
 