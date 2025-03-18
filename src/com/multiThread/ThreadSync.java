package com.multiThread;

public class ThreadSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("T1 Setup completed");
		});
		
		Thread t2=new Thread(()->{
			try {
				t1.join();
				for(int i=0;i<10;i++)
				{
					if(i%2==0)
					System.out.println(i);
						Thread.sleep(1000);
										}
				System.out.println("T2 Biz logic completed");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		Thread t3=new Thread(()->{
			try {
				t1.join();
				for(int i=0;i<10;i++)
				{
					if(i%2!=0)
					System.out.println(i);
						Thread.sleep(1000);
				}
				System.out.println("T3 Biz logic completed");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
