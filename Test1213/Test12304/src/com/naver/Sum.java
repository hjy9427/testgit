package com.naver;

public class Sum extends Object{
	public int num;
	public int val;
	
	Object key1 = new Object();
	
	public Sum() {
		// TODO Auto-generated constructor stub
		num = 0;
	}

	public Sum(int num) {
		super();
		this.num = num;
	}
	
	public synchronized void plusNum(int n) {
		
		synchronized (this) {
		num = num + n; //num += n;�̷��� �ᵵ ��
		}

	}
	public void subNum(int n) {
		synchronized(this) {
		num = num - n;
		}
		
	}
	
	public void subVal(int n) {
		synchronized (key1) {
		val = val - n;	         //�����ϴ� �����Ϳ� ���� �ٸ� ����
		}                        //�׷��� ���� �ΰ� this 
								//�Ʒ� �ΰ��� key1
	}
	
	public void plusVal(int n) {
		// TODO Auto-generated method stub
		synchronized (key1) {
		val = val + n;	
		}
		
		
	}
	
}
