package net.daum;

public class ChildEx1 extends ParentEx {
	private int z;
	
	public ChildEx1() {
		super();//�θ��� ����Ʈ �������̴�.�־�����.�θ�Ŭ���� ���Ѵ�
		
	}

	public ChildEx1(int z) {
		super(z);//�θ�Ŭ������ ������ ȣ��,������ �θ� ����.�޼ҵ� �׳� �̸��� �־ ����Ѱ�  super�� �־��� �����̴�.�������� �ʾ�����.
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	

}
