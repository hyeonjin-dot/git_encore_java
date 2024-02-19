package com.encore.thread;

public class ShareObj implements Runnable {
	public ShareObj() {}
	
	@Override
	public void run() {
		for(int i = 0; i < 10 ; i++) {
			System.out.print(i + "\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
