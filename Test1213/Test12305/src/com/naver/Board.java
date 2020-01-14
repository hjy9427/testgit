package com.naver;

public class Board {
	private String article;
	private boolean isOk = false;

	public String getArticle() {
		
		if(!isOk) {    //isOkay�� false�� ���� true�� ����ȵ�
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		return article; //���� �Ѱ��ִ°Ծƴ϶� ����ؾ���
	}

	public void setArticle(String article) {//�۰��� ����
		this.article = article;
		isOk = true;    //��������� ��� �پ�ƼŬ���� ����ؾ���
		synchronized (this) {  //���� ��ü�� �����ϰ������ϱ� this��
			//�۰��� ���� �ø��� true�� ��
			notifyAll(); //�̻��¸� exception �߻��ؼ� ��ũ�γ�����
		}
	}
	
	

}
