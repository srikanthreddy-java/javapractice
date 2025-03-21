package javapractice;

public final class ImutableEmployee {
	private final String name;
	private final int age;
	
	public ImutableEmployee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
}
