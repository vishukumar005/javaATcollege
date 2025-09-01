class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void displayInfo() {
		System.out.println("Name: "+name+", Age: "+age);
	}
}

class Student extends Person {
	String studentId;
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	void displayInfo() {
		System.out.println("Name: "+name+", Age: "+age+" studentId: "+studentId);
	}
}

class Q_1 {
	public static void main(String args[]) {
		Person p = new Person("Vishal", 21);
		p.displayInfo();
		Student s = new Student("Subhadip", 21, "124");
		s.displayInfo();
	}
}