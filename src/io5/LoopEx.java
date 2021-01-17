package io5;

public class LoopEx {

	public static void main(String[] args) {
		// main 쓰레드가 가다가 새로운 쓰레드를 생성
		// 새로운 차
		new Thread(() -> {

			for (int i = 0; i < 1000; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			// start = 시동을 걸고 출발하라
		}).start();
		// 달리던 차
		System.out.println("---------------------------");

		for (int i = 2000; i < 3000; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	} // end main
}
