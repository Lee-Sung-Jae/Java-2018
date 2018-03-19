public class Student38 {
	private int number, age;
	private String name;

	Student38() {
		number = 100;
		name = "New Student";
		age = 18;
	}

	Student38(int number, String name, int age) {
		this.number = number;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Student [number=%d, name=%s, age=%d]", number, name, age);
	}
}
