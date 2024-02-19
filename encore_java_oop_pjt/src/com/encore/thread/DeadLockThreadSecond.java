package com.encore.thread;

public class DeadLockThreadSecond implements Runnable{
	
	private StringBuffer sb01, sb02;
	
	public DeadLockThreadSecond() {}
	
	public DeadLockThreadSecond(StringBuffer sb01, StringBuffer sb02) {
		this.sb01 = sb01;
		this.sb02 = sb02;
	}
	
	@Override
	public void run() {
		synchronized (sb02) {
			sb02.append("hanwha");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//synchronized (sb01) {
			sb01.append("encore");
			System.out.println("second thread >>>> " + sb01.toString() + sb02.toString());
		//}
	}
}
