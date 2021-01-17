package io5;

public class Horse extends Thread {

	private String name;
	private int pos;

	public Horse(String name) {
		this.name = name;
	}

	public void race() {
		for (int i = 0; i < 100; i++) {
			pos = pos + (int) (Math.random() * 100);
			System.out.println("Horse : " + name + ":" + pos);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // end catch
		} // end for
	}// end method

	@Override
	public void run() {
		race();
	}

	public static void main(String[] args) {
		Horse h1 = new Horse("1번말");
		Horse h2 = new Horse("2번말");
		Horse h3 = new Horse("3번말");
		h1.start();
		h2.start();
		h3.start();
	}

}