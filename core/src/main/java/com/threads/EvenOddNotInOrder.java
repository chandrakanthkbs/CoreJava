package com.threads;

public class EvenOddNotInOrder {
	public static void main(String arg[]) {
		EvenOddNotInOrder evenOddNotInOrder = new EvenOddNotInOrder();
		evenOddNotInOrder.printNumbers();
	}

	private void printNumbers(){
		NumDisplayer objNumHolder = new NumDisplayer();
		Odd o1 = new Odd(objNumHolder);
		Even e1 = new Even(objNumHolder);
		o1.start();
		e1.start();

		Od o11 = new Od("OddThread");
		Eve e11 = new Eve("EvenThread");
		o11.run();
		e11.run();
	}

	class Eve extends Thread{

		public Eve(String name)
		{
			super(name);
		}

		public void run(){

			for(int i=0;i<11;i++){
				if(i%2 == 0)
					System.out.println(i);
			}
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	class Od extends Thread {

		public Od(String name) {
			super(name);
		}

		public void run() {

			for (int i = 0; i < 11; i++) {
				if (i % 2 == 1)
					System.out.println(i);
			}
		}
	}
}



