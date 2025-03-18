package com.multiThread;

public class EvenOddNumber {
	
	public static int N=10;
	
	int count=1;
	
	public void evenNumber()
	{
		
		synchronized (this) {
			
			while(count<N)
			{
				while(count%2!=0)
				{
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Even Num:"+count);
				count++;
				notify();
			}
		}
				
			
			
		}

		
		
		public void oddNumber()
		{
			
			synchronized (this) {
				
				while(count<N)
				{
					while(count%2==0)
					{
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					System.out.println("Odd Num:"+count);
					count++;
					notify();
					
				}
				
			}

		
	}
	
	public static void main(String[] args) {
		
	   EvenOddNumber obj=new EvenOddNumber();
	   EvenThread t1=new EvenThread(obj);
	   OddThread t2=new OddThread(obj);
	   
	   t1.start();
	   t2.start();
	
		
	}

}
