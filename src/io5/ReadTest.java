package io5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadTest {

	// bad code
	public static void main(String[] args) throws Exception{
		// 파일 확장자는 의미 x
		InputStream in = new FileInputStream("C:\\zzz\\data.dat");
		ObjectInputStream oin = new ObjectInputStream(in);
		
		Object obj = oin.readObject();
		// 다운캐스팅하는 이유 -> Object가 더 상위
		Message msg = (Message)obj;
		
		System.out.println(msg);
		
	}
}
