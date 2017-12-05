package com.lph.ConsumerAndProvider;

import java.util.concurrent.BlockingDeque;

public class Consumer implements Runnable{
	private final BlockingDeque queue;
	
	public Consumer(BlockingDeque queue) {
		this.queue = queue;
	}
	void consume(Object o){
	
	}
	
	@Override
	public void run() {
		try{
			while(true){
				consume(queue.take());
			}
		}catch(InterruptedException e){
		
		}
	}
}
