package com.threads;

public class Even extends Thread {
	private NumDisplayer objNumHolder;

	public Even(NumDisplayer p_objNumHolder) {
		objNumHolder = p_objNumHolder;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				objNumHolder.printEvenNumber();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}