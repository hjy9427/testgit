package net.daum;

public class ChildEx2 extends ParentEx{
	
	private int a;//�θ� �ִ�.
	
	public ChildEx2() {
		
	}

	public ChildEx2(int a) {
		super();//����Ʈ �����ڸ� ȣ���ϴ� �ڵ�
		this.a = a;
		
		super.setA(a);//�̰��� �θ� ����� ������ ���� �ٲ��༭ �θ��� ���������a�� �ٲ��ش�
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	
}
