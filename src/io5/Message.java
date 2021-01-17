package io5;

import java.io.Serializable;

public class Message implements Serializable {

	// 복잡한 서버에 보낼 객체를 담을 클래스(VO/DTO)이므로 직렬화 걸어준다
	private static final long serialVersionUID = 1L;
	private String from , to , text;

	public Message(String from, String to, String text) {
		super();
		this.from = from;
		this.to = to;
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [from=" + from + ", to=" + to + ", text=" + text + "]";
	}
	
	
}
