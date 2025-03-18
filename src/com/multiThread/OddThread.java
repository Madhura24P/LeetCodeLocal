package com.multiThread;

public class OddThread extends Thread{
	
	private EvenOddNumber obj;
	
	public OddThread(EvenOddNumber obj)
	{
		this.obj=obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.oddNumber();
	}

}
