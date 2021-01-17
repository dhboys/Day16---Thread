package io5;

import java.util.Iterator;

public class ThreadEx1 implements Runnable {

	@Override
	public void run() {
		try {
			doJob();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doJob() throws Exception {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
			Thread.sleep(100);
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		ThreadEx1 sumEx = new ThreadEx1();
		Thread t0 = new Thread(sumEx);
		Thread t1 = new Thread(sumEx);
		t0.start();
		t1.start();
		System.out.println("-------------------");
	}
}
