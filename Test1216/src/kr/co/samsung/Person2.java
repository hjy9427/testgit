package kr.co.samsung;

public class Person2 {
	
	
	private Sonata[] sArr;
	private BMW[] bArr;
	private SM5[] s5Arr;
	private SM7[] s7Arr;
	
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}
	public Person2(Sonata[] sArr, BMW[] bArr) {
		super();
		this.sArr = sArr;
		this.bArr = bArr;
	}

	public Person2(Sonata[] sArr, BMW[] bArr, SM5[] s5Arr, SM7[] s7Arr) {
		super();
		this.sArr = sArr;
		this.bArr = bArr;
		this.s5Arr = s5Arr;
		this.s7Arr = s7Arr;
	}
	public SM7[] getS7Arr() {
		return s7Arr;
	}
	public void setS7Arr(SM7[] s7Arr) {
		this.s7Arr = s7Arr;
	}
	public Person2(Sonata[] sArr, BMW[] bArr, SM5[] s5Arr) {
		super();
		this.sArr = sArr;
		this.bArr = bArr;
		this.s5Arr = s5Arr;
	}

	public SM5[] getS5Arr() {
		return s5Arr;
	}

	public void setS5Arr(SM5[] s5Arr) {
		this.s5Arr = s5Arr;
	}

	public Sonata[] getsArr() {
		return sArr;
	}

	public void setsArr(Sonata[] sArr) {
		this.sArr = sArr;
	}

	public BMW[] getbArr() {
		return bArr;
	}

	public void setbArr(BMW[] bArr) {
		this.bArr = bArr;
	}
	
	
	
}
