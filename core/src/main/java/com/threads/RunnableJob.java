package com.threads;

public class RunnableJob implements Runnable {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": start");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.getName() + ": stop");
	}

}