package chapter4;

public class Student {
	// class attribute
	String name;
	int age;

	public void Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class method
	void learnJava() {
		System.out.println("Learn Java with ytb");
	}

	int getAge() {
		return 24;
	}
}
