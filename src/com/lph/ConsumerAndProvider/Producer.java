package com.lph.ConsumerAndProvider;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private final BlockingQueue queue;
	
	public Producer(BlockingQueue queue){
		this.queue = queue;
	}
	
	Object produce(){
		return null;
	}
	
	@Override
	public void run() {
		try{
			queue.put(produce());
		}catch(InterruptedException e){
		
		}
	}
}
