package com.multiThread;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		CounterUpdate t1=new CounterUpdate(c);
		CounterUpdate t2=new CounterUpdate(c);
		t1.start();
		t2.start();
		try {
		t1.join();
		t2.join();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Final"+c.getCounter());

	}

}

class Counter
{
	private int counter;
	
	public synchronized void increment()
	{
		counter++;
	}
	
	public int getCounter()
	{
		return counter;
	}
}

class CounterUpdate extends Thread
{
	private Counter c;
	
	public CounterUpdate(Counter c)
	{
		this.c=c;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++)
		{
			c.increment();
		}
	}
	
}
