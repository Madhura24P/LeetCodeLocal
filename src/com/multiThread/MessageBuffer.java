package com.multiThread;

public class MessageBuffer {
	
	private String message;
	private boolean messageAvailable;
	
	public synchronized void sendMessage(String message)
	{
		if(messageAvailable)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.message=message;
		messageAvailable=true;
		System.out.println("Message sent:"+message);
		notify();
		
	}
	
	public synchronized void readMessage()
	{
		if(!messageAvailable)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		System.out.println("Message received:"+message);
		messageAvailable=false;
		notify();
	}

}
