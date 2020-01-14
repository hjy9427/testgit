package com.naver;

public class Writer extends Thread {
	Board board;
	
	public Writer() {
		// TODO Auto-generated constructor stub
	}

	public Writer(Board board) {
		super();
		this.board = board;
	}
	
	@Override
	public void run() {
		board.setArticle("Happy new year!!!");
	}

}
