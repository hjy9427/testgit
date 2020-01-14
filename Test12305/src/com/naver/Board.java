package com.naver;

public class Board {
	private String article;
	private boolean isOk = false;

	public String getArticle() {
		
		if(!isOk) {    //isOkay가 false면 실행 true면 실행안됨
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		return article; //값을 넘겨주는게아니라 대기해야함
	}

	public void setArticle(String article) {//작가가 접근
		this.article = article;
		isOk = true;    //멤버변수로 사용 겟아티클에서 사용해야함
		synchronized (this) {  //같은 객체를 공유하고있으니까 this임
			//작가가 글을 올리면 true로 뜸
			notifyAll(); //이상태면 exception 발생해서 싱크로나이즈
		}
	}
	
	

}
