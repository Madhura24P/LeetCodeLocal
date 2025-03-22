package com.multiThread;

public class PrintNumbersLetters {
	
	private static boolean printLetter=true;
	private static final Object lock=new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable letterTask=new Runnable()
				{
			@Override
			public void run()
			{
				for(char ch='A';ch<'Z';ch++)
				{
					synchronized(lock)
					{
						if(!printLetter)
						{
							try {
								lock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
						System.out.print(ch);
						printLetter=false;
						lock.notify();
					}
				}
			}
				};
				
		Runnable numberTask=new Runnable()
				{
			@Override
			public void run()
			{
				for(int  num=1;num<=26;num++)
				{
					synchronized(lock)
					{
						if(printLetter)
						{
							try {
								lock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
						System.out.print(num);
						printLetter=true;
						lock.notify();
					}
				}
				
			}
				};
				
				
				Thread letterThread=new Thread(letterTask);
				Thread numThread=new Thread(numberTask);
				letterThread.start();
				numThread.start();
				
				try {
					letterThread.join();
					numThread.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

	}

}
