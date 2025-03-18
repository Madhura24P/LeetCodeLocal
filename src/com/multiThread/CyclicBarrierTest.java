package com.multiThread;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicBarrier cb=new CyclicBarrier(5);
		for(int i=0;i<5;i++)
		{
			Friend f=new Friend(cb,"F"+i);
			f.start();
			
		}

	}

}
