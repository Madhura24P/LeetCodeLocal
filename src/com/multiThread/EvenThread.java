package com.multiThread;

public class EvenThread extends Thread{
	
	private EvenOddNumber obj;
	
	public EvenThread(EvenOddNumber obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.evenNumber();
	}

}
