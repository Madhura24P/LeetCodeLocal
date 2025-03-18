package com.multiThread;

public class MessageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageBuffer mb=new MessageBuffer();
		
		Thread sender=new Thread(() ->{
			for(int i=0;i<5;i++)
			{
				mb.sendMessage("Hello_"+i);
			}
		});
		
		Thread reader=new Thread(() ->{
			for(int i=0;i<5;i++)
			{
				mb.readMessage();
			}
		});
		
		sender.start();
		reader.start();

	}
	
	

}
