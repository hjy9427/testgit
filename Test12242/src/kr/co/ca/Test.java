package kr.co.ca;

public class Test<T> {
	private T name;
	private T id;
	private int age;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(T name, T id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
}
