package com.threads;

public class NumDisplayer {
	private int count = 1;
	private boolean temp = false;

	public synchronized void printOddNumber() throws Exception {
		while (temp == true) {
			wait();
		}
		System.out.println(count++);
		temp = true;
		notifyAll();
	}

	public synchronized void printEvenNumber() throws InterruptedException {
		while (temp == false) {
			wait();
		}
		System.out.println(count++);
		temp = false;
		notifyAll();
	}
}