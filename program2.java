class Student {
	private String name;
	private int rollNumber;
	private char grade;
	
	//Constructor with all attributes
	public Student(String name, int rollNumber, char grade) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}
	
	//Overloaded constructor: initialize name & rollNumber, default grade 'A';
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = 'A';
	}
	public  void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Grade: "+grade);
		System.out.println("---------------");
	}
	public static void main(String args[]) {
		Student s1  = new Student("Vishal", 125, 'B');
		Student s2 = new Student ("Akash", 126);
		
		s1.display();
		s2.display();
	}
}