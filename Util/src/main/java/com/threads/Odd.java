package com.threads;

public class Odd extends Thread {
	private NumDisplayer objNumHolder;

	public Odd(NumDisplayer p_objNumHolder) {
		objNumHolder = p_objNumHolder;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				objNumHolder.printOddNumber();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}